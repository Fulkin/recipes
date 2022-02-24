package recipes.security;

import org.springframework.stereotype.Component;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author Fulkin
 * Created on 24.02.2022
 */

@Component
public class UserRepository {
    private final Map<String, User> users = new ConcurrentHashMap<>();

    public User findUserByUsername(String username) {
        return users.get(username);
    }

    public void save(User user) {
        users.put(user.getEmail(), user);
    }
}
