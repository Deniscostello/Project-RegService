package ie.atu.cicdprojectregistrationservice;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name="email-service", url="http://springboot-emailservice:8083")
public interface EmailServiceClient {
    @PostMapping("/email")
    String emailDetails(@RequestBody User user);
}
