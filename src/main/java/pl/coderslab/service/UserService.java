package pl.coderslab.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pl.coderslab.entity.User;
import pl.coderslab.dao.UserDao;
import pl.coderslab.repository.UserRepository;

@Transactional
@Service
public class UserService {

    public UserDao userDao;
    public UserRepository userRepository;

    public UserService(UserDao userDao, UserRepository userRepository) {
        this.userDao = userDao;
        this.userRepository = userRepository;
    }

    public void save(User user) {
        userDao.save(user);
    }

    public User findByEmail (String email) {
        return userRepository.findByEmail(email);
    }

}
