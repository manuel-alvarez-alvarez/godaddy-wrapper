package es.malvarez.goddady.network;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class ListIpProvider implements IpProvider {

    private static final Logger LOG = LoggerFactory.getLogger(ListIpProvider.class);

    private final List<IpProvider> delegated;

    public ListIpProvider(List<IpProvider> delegated) {
        this.delegated = delegated;
    }

    @Override
    public String getExternalIp() {
        Map<String, Integer> results = new LinkedHashMap<>();
        for (IpProvider provider : delegated) {
            try {
                String ip = provider.getExternalIp();
                Integer number = results.get(ip);
                if (number == null) {
                    number = 0;
                }
                results.put(ip, number + 1);
            } catch (Throwable e) {
                LOG.error(String.format("Error parsing the IP with the provider %s", provider.getClass().getName()), e);
            }
        }
        if (results.isEmpty()) {
            return null;
        }
        if (results.size() > 1) {
            LOG.warn("Multiple public IPs found {}", results);
        }
        int maxValueInMap = (Collections.max(results.values()));
        return results.entrySet()
                .stream()
                .filter(entry -> entry.getValue() == maxValueInMap)
                .findFirst()
                .get()
                .getKey();
    }
}
