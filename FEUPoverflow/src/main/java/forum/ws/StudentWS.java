package forum.ws;

import forum.domain.Student;
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
    public ResponseEntity<Student> getStudentById(@PathVariable Long id){
        Student student = studentRepository.findOne(id);
        return new ResponseEntity<Student>(student, HttpStatus.OK);
    }

}