/*package forum.service;

import forum.domain.Student;
import forum.domain.StudentRepository;
import org.junit.Assert;
import org.junit.Test;

import javax.inject.Inject;

import static org.junit.Assert.*;

public class StudentServiceImplTest {
    @Inject
    private StudentRepository studentRepository;
    @Test
    public void createStudent() throws Exception {
        Student student;
        student = new Student();
        long id= 2017L;
        String first="Joao";
        String last="Test";
        student.setId(id);
        Student actualStudent= studentRepository.findById(id);
        Assert.assertEquals(student, actualStudent); }

    @Test
    public void getStudentById() throws Exception {
    }

    @Test
    public void updateStudent() throws Exception {
    }

    @Test
    public void removeStudent() throws Exception {
    }

}*/
