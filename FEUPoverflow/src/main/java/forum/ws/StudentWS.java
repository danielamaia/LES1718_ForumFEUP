package forum.ws;

import javax.inject.Inject;

import forum.service.StudentDTO;
import forum.service.StudentMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import forum.domain.Student;
import forum.service.StudentService;

@RestController
public class StudentWS {

    @Inject
    private StudentService studentService;

    @RequestMapping(value = "/student/{id}", method = RequestMethod.GET)
    public ResponseEntity<Student> getStudentById(@PathVariable Long id){
        Student student = studentService.getStudentById(id);
        return new ResponseEntity<>(student, HttpStatus.OK);
    }

    @RequestMapping(value = "/student", method = RequestMethod.POST)
    public ResponseEntity<Void> getStudentById(@RequestBody StudentDTO student){
        Student newStudent = StudentMapper.INSTANCE.toStudent(student);
        studentService.createStudent(newStudent);
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    @RequestMapping(value = "/student/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<Void> removeStudent(@PathVariable Long id){
        Student student = studentService.getStudentById(id);
        studentService.removeStudent(student);
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

}