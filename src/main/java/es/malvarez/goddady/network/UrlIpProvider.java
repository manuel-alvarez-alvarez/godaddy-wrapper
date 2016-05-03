package es.malvarez.goddady.network;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

public abstract class UrlIpProvider implements IpProvider {

    private final String url;

    public UrlIpProvider(String url) {
        this.url = url;
    }

    @Override
    public final String getExternalIp() {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(new URL(this.url).openStream()))) {
            String theLine;
            StringBuilder builder = new StringBuilder();
            while ((theLine = reader.readLine()) != null) {
                if (builder.length() > 0) {
                    builder.append("\n");
                }
                builder.append(theLine);
            }
            return parseIp(builder.toString());
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    protected abstract String parseIp(String response);
}
