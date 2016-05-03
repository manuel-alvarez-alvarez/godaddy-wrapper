package es.malvarez.goddady.network;

public class IcanHazIpProvider extends UrlIpProvider {

    public IcanHazIpProvider(String url) {
        super(url);
    }

    @Override
    protected String parseIp(String response) {
        return response;
    }
}
