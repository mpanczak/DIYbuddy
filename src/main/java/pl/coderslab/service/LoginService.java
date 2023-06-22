package pl.coderslab.service;

import org.mindrot.jbcrypt.BCrypt;
import org.springframework.stereotype.Service;
import pl.coderslab.entity.User;

@Service
public class LoginService {

    private final UserService userService;

    public LoginService(UserService userService) {
        this.userService = userService;
    }

    public boolean isUserValid(String email, String password) {

        User user = userService.findByEmail(email);
        if (user == null) {
            return false;
        } else {
            String storedPassword = user.getPassword();
            return BCrypt.checkpw(password, storedPassword);
        }
    }
}
