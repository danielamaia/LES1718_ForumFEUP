package forum.ws;

import forum.domain.StudentRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import javax.inject.Inject;

@RestController
public class StudentWS {

    @Inject
    private StudentRepository studentRepository;

    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }

    @RequestMapping(value = "/student/{id}", method = RequestMethod.GET)
    public ResponseEntity<String> getCostumerById(@PathVariable Long id){
        String student = studentRepository.findOne(id).getLastName();
        return new ResponseEntity<String>(student, HttpStatus.OK);
    }

}