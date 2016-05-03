package es.malvarez.goddady.network;

public class IpifyProvider extends UrlIpProvider {

    public IpifyProvider(String url) {
        super(url);
    }

    @Override
    protected String parseIp(String response) {
        return response;
    }
}
