package ie.atu.cicdprojectregistrationservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.event.EventListener;

@EnableFeignClients
@SpringBootApplication
public class CiCdProjectRegistrationServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(CiCdProjectRegistrationServiceApplication.class, args);
    }



}
