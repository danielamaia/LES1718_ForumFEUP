package forum.ws;

import com.fasterxml.jackson.databind.ObjectMapper;
import forum.domain.User;
import forum.service.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.inject.Inject;
import java.io.IOException;

@RestController
public class UserWS {
    @Inject
    private UserService userService;
    ObjectMapper objectMapper = new ObjectMapper();

    @RequestMapping(value = "/user/{id}", method = RequestMethod.GET)
    public ResponseEntity<User> getUserById(@PathVariable Long id){
        User user = userService.getUserById(id);
        return new ResponseEntity<>(user, HttpStatus.OK);
    }

    @RequestMapping(value = "/user", method = RequestMethod.POST)
    public ResponseEntity<Void> createUser(@RequestBody String userJson){
        User user = null;
        try {
            user = objectMapper.readValue(userJson, User.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        userService.createUser(user);
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    @RequestMapping(value = "/user/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<Void> removeUser(@PathVariable Long id){
        User user = userService.getUserById(id);
        userService.removeUser(user);
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

}