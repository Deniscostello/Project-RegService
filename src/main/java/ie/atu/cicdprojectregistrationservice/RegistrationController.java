package ie.atu.cicdprojectregistrationservice;

import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class RegistrationController {

    private final EmailServiceClient emailServiceClient;

    public RegistrationController(EmailServiceClient emailServiceClient) {
        this.emailServiceClient = emailServiceClient;
    }


    @PostMapping("/confirm")
    public String confirmUser(@Valid @RequestBody User user){
        String confirmEmail = emailServiceClient.emailDetails(user);
        System.out.println(confirmEmail);
        String confirmation = "User registered " + user.getName() + " " + user.getEmail();

        return confirmation;
    }
}
