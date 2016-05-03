package es.malvarez.goddady.config;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.module.SimpleModule;
import com.fasterxml.jackson.databind.ser.std.DateSerializer;
import io.swagger.client.ApiClient;
import io.swagger.client.model.Datetime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

@Configuration
@AutoConfigureAfter(EndpointsConfig.class)
public class JacksonConfig {

    private static final String DATE_PATTERN = "yyyy-MM-dd'T'HH:mm:ss'Z'";

    @Autowired
    private ApiClient apiClient;

    @Autowired
    private ApplicationContext applicationContext;

    @Bean
    public Module customSerializers() {
        SimpleModule module = new SimpleModule();
        module.addSerializer(Datetime.class, new DatetimeSerializer());
        module.addDeserializer(Datetime.class, new DatetimeDeserializer());
        return module;
    }

    @PostConstruct
    public void setup() {
        final ObjectMapper mapper = apiClient.getObjectMapper();
        applicationContext.getBeansOfType(Module.class).values().forEach(mapper::registerModule);
    }

    public static class DatetimeSerializer extends DateSerializer {

        public DatetimeSerializer() {
            super(true, createDateFormat());
        }

        private static DateFormat createDateFormat() {
            DateFormat format = new SimpleDateFormat(DATE_PATTERN);
            format.setTimeZone(TimeZone.getTimeZone("UTC"));
            return format;
        }
    }

    public static class DatetimeDeserializer extends JsonDeserializer<Datetime> {

        @Override
        public Datetime deserialize(JsonParser p, DeserializationContext ctxt) throws IOException, JsonProcessingException {
            String stringValue = p.getValueAsString();
            if (stringValue == null || stringValue.isEmpty()) {
                return null;
            }
            try {
                DateFormat format = new SimpleDateFormat(DATE_PATTERN);
                format.setTimeZone(TimeZone.getTimeZone("UTC"));
                Date date = new SimpleDateFormat(DATE_PATTERN).parse(stringValue);
                return new Datetime(date.getTime());
            } catch (ParseException e) {
                throw new JsonMappingException(e.getMessage(), e);
            }
        }
    }

}
