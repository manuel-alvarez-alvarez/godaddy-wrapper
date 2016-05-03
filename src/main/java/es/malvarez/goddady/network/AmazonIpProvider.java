package es.malvarez.goddady.network;

public class AmazonIpProvider extends UrlIpProvider {

    public AmazonIpProvider(String url) {
        super(url);
    }

    @Override
    protected String parseIp(String response) {
        return response;
    }
}
