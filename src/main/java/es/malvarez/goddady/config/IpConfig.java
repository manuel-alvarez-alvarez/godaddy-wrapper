package es.malvarez.goddady.config;

import es.malvarez.goddady.network.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
public class IpConfig {

    @Autowired
    private IpSettings settings;

    @Bean
    public IpProvider ipProvider() {
        return new ListIpProvider(Arrays.asList(
                new AmazonIpProvider(settings.getAmazon()),
                new IcanHazIpProvider(settings.getIcanhazip()),
                new IpifyProvider(settings.getIpify())
        ));
    }
}
