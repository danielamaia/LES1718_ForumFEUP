package forum.service;

import forum.domain.Student;
import forum.domain.User;
import org.springframework.stereotype.Service;

@Service
public interface UserService {

    void createUser(User newUser);
    User getUserById(Long id);
    void updateUser(User newUser);
    void removeUser(User user);
}
