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

    private List<DNSRecord> nsDomainEntries;
    private DNSRecord aDomainEntry;

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

    protected void fetchGodaddyIp() {
        try {
            List<DNSRecord> aRecord = vdomainsApi.recordGet(
                    settings.getDomain(),
                    DNSRecord.TypeEnum.A.toString(),
                    settings.getDnsName(),
                    null,
                    null,
                    null
            );
            if (aRecord.isEmpty()) {
                throw new RuntimeException(
                        String.format(
                                "Could not find any domain of type %s and name %s for the domain %s",
                                DNSRecord.TypeEnum.A.toString(),
                                settings.getDnsName(),
                                settings.getDomain()
                        )
                );
            }
            aDomainEntry = aRecord.get(0);

            List<DNSRecord> nsRecords = vdomainsApi.recordGet(
                    settings.getDomain(),
                    DNSRecord.TypeEnum.NS.toString(),
                    settings.getDnsName(),
                    null,
                    null,
                    null
            );
            if (nsRecords.size() < 2) {
                throw new RuntimeException(
                        String.format(
                                "Could not find any domain of type %s and name %s for the domain %s",
                                DNSRecord.TypeEnum.NS.toString(),
                                settings.getDnsName(),
                                settings.getDomain()
                        )
                );
            }
            nsDomainEntries = nsRecords;

        } catch (ApiException e) {
            throw new RuntimeException("Cannot get godaddy IP for domain " + settings.getDomain(), e);
        }
    }

    protected void updateGodaddyIp(String newIp) {
        try {
            aDomainEntry.setData(newIp);
            List<DNSRecord> entries = new LinkedList<>();
            entries.add(aDomainEntry);
            entries.addAll(nsDomainEntries);
            vdomainsApi.recordReplace(settings.getDomain(), entries, null);
        } catch (ApiException e) {
            throw new RuntimeException("Cannot update godaddy IP for domain " + settings.getDomain(), e);
        }
    }
}
