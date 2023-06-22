package pl.coderslab.service;

import org.mindrot.jbcrypt.BCrypt;
import org.springframework.stereotype.Service;
import pl.coderslab.entity.User;

@Service
public class RegisterService {
    public UserService userService;

    public RegisterService(UserService userService){
        this.userService = userService;
    }


    public void registerNewUser(String email, String userName, String password, String repeatedPassword) {

        if (password.equals(repeatedPassword)) {
            User user = new User();
            user.setEmail(email);
            user.setLogin(userName);
            user.setPassword(BCrypt.hashpw(password,BCrypt.gensalt()));

            userService.save(user);
        }
    }

}
