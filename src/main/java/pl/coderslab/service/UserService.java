package pl.coderslab.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pl.coderslab.entity.User;
import pl.coderslab.repository.UserRepository;

@Transactional
@Service
public class UserService {

    private UserRepository userRepository;

    public void save(User user) {
        userRepository.save(user);
    }
}