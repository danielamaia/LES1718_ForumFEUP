package forum.ws;

import javax.inject.Inject;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import forum.domain.Student;
import forum.service.StudentService;

import java.io.IOException;

@RestController
public class StudentWS {

    @Inject
    private StudentService studentService;
    ObjectMapper objectMapper = new ObjectMapper();

    @RequestMapping(value = "/student/{id}", method = RequestMethod.GET)
    public ResponseEntity<Student> getStudentById(@PathVariable Long id){
        Student student = studentService.getStudentById(id);
        return new ResponseEntity<>(student, HttpStatus.OK);
    }

    @RequestMapping(value = "/student", method = RequestMethod.POST)
    public ResponseEntity<Void> createStudent(@RequestBody String studentJson){
        Student student = null;
        try {
            student = objectMapper.readValue(studentJson, Student.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        studentService.createStudent(student);
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    @RequestMapping(value = "/student/{id}", method = RequestMethod.PUT)
    public ResponseEntity<Void> updateStudent(@RequestBody String studentJson){
        Student student = null;
        try {
            student = objectMapper.readValue(studentJson, Student.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        studentService.updateStudent(student);
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    @RequestMapping(value = "/student/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<Void> removeStudent(@PathVariable Long id){
        Student student = studentService.getStudentById(id);
        studentService.removeStudent(student);
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

}