package recipes.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import recipes.security.User;
import recipes.security.UserRepository;

import javax.validation.Valid;

/**
 * @author Fulkin
 * Created on 23.02.2022
 */

@RestController
@Validated
public class RegistrationController {

    @Autowired
    UserRepository userRepo;

    @Autowired
    PasswordEncoder encoder;

    @PostMapping("/api/register")
    public void register(@RequestBody @Valid User user) {
        user.setPassword(encoder.encode(user.getPassword()));
        user.setRole("ROLE_USER");
        userRepo.save(user);
    }
}
