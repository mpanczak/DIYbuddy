package pl.coderslab.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pl.coderslab.entity.User;

@Service
public class LoginService {

    private UserService userService;

    public LoginService(UserService userService) {
        this.userService = userService;
    }

    public boolean isUserValid(String email, String password) {

        User user = userService.findByEmail(email);

        return null != user;
    }
}
