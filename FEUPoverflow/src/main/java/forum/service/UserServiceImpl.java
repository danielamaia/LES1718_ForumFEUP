package forum.service;

import forum.domain.Student;
import forum.domain.StudentRepository;
import forum.domain.User;
import forum.domain.UserRepository;
import org.springframework.stereotype.Service;

import javax.inject.Inject;

@Service
public class UserServiceImpl implements UserService {

    @Inject
    private UserRepository userRepository;

    @Override
    public void createUser(User newUser) {
        userRepository.save(newUser);
    }

    @Override
    public User getUserById(Long id) {
        return userRepository.findOne(id);
    }

    @Override
    public void updateUser(User newUser) {
        userRepository.save(newUser);
    }

    @Override
    public void removeUser(User user) {
        userRepository.delete(user);
    }
}
