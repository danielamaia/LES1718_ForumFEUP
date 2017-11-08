package forum.ws;

import forum.domain.Student;
import forum.domain.User;
import forum.service.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.inject.Inject;

@RestController
public class UserWS {

    @Inject
    private UserService userService;

    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }

    @RequestMapping(value = "/user/{id}", method = RequestMethod.GET)
    public ResponseEntity<User> getUserById(@PathVariable Long id){
        User user = userService.getUserById(id);
        return new ResponseEntity<>(user, HttpStatus.OK);
    }

    @RequestMapping(value = "/user", method = RequestMethod.POST)
    public ResponseEntity<Void> getUserById(@RequestBody UserDTO user){
        User newUser = UserMapper.INSTANCE.toUser(user);
        userService.createUser(newUser);
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    @RequestMapping(value = "/user/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<Void> removeUser(@PathVariable Long id){
        User user = userService.getUserById(id);
        userService.removeUser(user);
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

}