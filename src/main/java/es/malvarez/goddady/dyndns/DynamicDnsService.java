package es.malvarez.goddady.dyndns;

import es.malvarez.goddady.config.DynamicDnsSettings;
import es.malvarez.goddady.network.IpProvider;
import io.swagger.client.ApiException;
import io.swagger.client.api.VdomainsApi;
import io.swagger.client.model.DNSRecord;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.LinkedList;
import java.util.List;

import static io.swagger.client.model.DNSRecord.TypeEnum.*;

@Service
@ConditionalOnProperty(prefix = "dynamicdns", name = "enable", havingValue = "true")
public class DynamicDnsService {

    private static final Logger LOG = LoggerFactory.getLogger(DynamicDnsService.class);

    @Autowired
    private VdomainsApi vdomainsApi;

    @Autowired
    private IpProvider ipProvider;

    @Autowired
    private DynamicDnsSettings settings;

    private DNSRecord aDomainEntry;
    private List<DNSRecord> nsDomainEntries;
    private List<DNSRecord> cnameDomainEntries;
    private List<DNSRecord> mxDomainEntries;
    private List<DNSRecord> txtDomainEntries;

    @PostConstruct
    public void setup() {
        fetchGodaddyIp();
    }

    @Scheduled(fixedRateString = "${dynamicdns.schedule}")
    public void checkExternalIp() {
        String externalIp = ipProvider.getExternalIp();
        String godaddyIp = aDomainEntry.getData();
        LOG.debug("Check IP: godaddy {}, external {}", godaddyIp, externalIp);
        if (!externalIp.equals(godaddyIp)) {
            LOG.info("Update IP: {} -> {}, TTL {}s", godaddyIp, externalIp, aDomainEntry.getTtl());
            updateGodaddyIp(externalIp);
            fetchGodaddyIp();
        }
    }

    private void fetchGodaddyIp() {
        try {
            List<DNSRecord> aRecord = vdomainsApi.recordGet(settings.getDomain(), A.toString(), settings.getDnsName(), null, null, null);
            if (aRecord.isEmpty()) {
                throw new RuntimeException(
                        String.format(
                                "Could not find any domain of type %s and name %s for the domain %s",
                                A.toString(),
                                settings.getDnsName(),
                                settings.getDomain()
                        )
                );
            }
            aDomainEntry = aRecord.get(0);
            nsDomainEntries = vdomainsApi.recordGet(settings.getDomain(), NS.toString(), null, null, null, null);
            cnameDomainEntries = vdomainsApi.recordGet(settings.getDomain(), CNAME.toString(), null, null, null, null);
            mxDomainEntries = vdomainsApi.recordGet(settings.getDomain(), MX.toString(), null, null, null, null);
            txtDomainEntries = vdomainsApi.recordGet(settings.getDomain(), TXT.toString(), null, null, null, null);
        } catch (ApiException e) {
            throw new RuntimeException("Cannot get godaddy IP for domain " + settings.getDomain(), e);
        }
    }

    private void updateGodaddyIp(String newIp) {
        try {
            aDomainEntry.setData(newIp);
            List<DNSRecord> entries = new LinkedList<>();
            entries.add(aDomainEntry);
            entries.addAll(nsDomainEntries);
            entries.addAll(cnameDomainEntries);
            entries.addAll(mxDomainEntries);
            entries.addAll(txtDomainEntries);
            vdomainsApi.recordReplace(settings.getDomain(), entries, null);
        } catch (ApiException e) {
            throw new RuntimeException("Cannot update godaddy IP for domain " + settings.getDomain(), e);
        }
    }
}
