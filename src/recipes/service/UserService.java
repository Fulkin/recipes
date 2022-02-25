package recipes.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import recipes.bean.User;
import recipes.repository.UserRepository;

/**
 * @author Fulkin
 * Created on 24.02.2022
 */

@Service
public class UserService {

    @Autowired
    UserRepository userRepo;

    public User getUserByEmail(String email) {
        return userRepo.findByEmail(email);
    }

    public void save(User user) {
        userRepo.save(user);
    }
}
