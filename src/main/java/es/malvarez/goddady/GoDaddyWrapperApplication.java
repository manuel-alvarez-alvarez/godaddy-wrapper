package es.malvarez.goddady;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
public class GoDaddyWrapperApplication implements ApplicationRunner {


    @Override
    public void run(ApplicationArguments args) throws Exception {
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(GoDaddyWrapperApplication.class, args);
    }
}
