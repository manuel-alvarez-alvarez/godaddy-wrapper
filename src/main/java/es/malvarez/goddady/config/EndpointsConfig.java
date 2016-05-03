package es.malvarez.goddady.config;

import io.swagger.client.ApiClient;
import io.swagger.client.api.VdomainsApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class EndpointsConfig {

    @Autowired
    private GoDaddySettings settings;

    @Bean
    public ApiClient apiClient() {
        ApiClient apiClient = new ApiClient();
        apiClient.setDebugging(settings.isDebug());
        apiClient.setBasePath(settings.getUrl());
        apiClient.addDefaultHeader("Authorization", String.format("sso-key %s:%s", settings.getKey(), settings.getSecret()));
        return apiClient;
    }

    @Bean
    public VdomainsApi getVdomainsApi(ApiClient apiClient) {
        VdomainsApi api = new VdomainsApi();
        api.setApiClient(apiClient);
        return api;
    }
}
