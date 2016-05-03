package es.malvarez.goddady.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "ip")
public class IpSettings {

    private String amazon;
    private String icanhazip;
    private String ipify;


    public String getAmazon() {
        return amazon;
    }

    public void setAmazon(String amazon) {
        this.amazon = amazon;
    }

    public String getIcanhazip() {
        return icanhazip;
    }

    public void setIcanhazip(String icanhazip) {
        this.icanhazip = icanhazip;
    }

    public String getIpify() {
        return ipify;
    }

    public void setIpify(String ipify) {
        this.ipify = ipify;
    }
}
