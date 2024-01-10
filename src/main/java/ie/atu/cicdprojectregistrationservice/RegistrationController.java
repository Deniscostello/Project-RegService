package ie.atu.cicdprojectregistrationservice;

import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RegistrationController {
    @PostMapping("/confirm")
    public String confirmUser(@Valid @RequestBody User user){
        String confirmation = "User registered " + user.getName() + " " + user.getEmail();
        return confirmation;
    }
}
