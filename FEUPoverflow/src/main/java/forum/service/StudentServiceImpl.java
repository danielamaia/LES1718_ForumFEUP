package forum.service;

import forum.domain.Student;
import forum.domain.StudentRepository;
import org.springframework.transaction.annotation.Transactional;

import javax.inject.Inject;
import java.util.List;

public class StudentServiceImpl implements StudentService {

    @Inject
    private StudentRepository studentRepository;

    @Override
    public void createNewStudent(Student newStudent) {
        studentRepository.save(newStudent);
    }

    @Override
    public Student getStudentById(Long id) {
        return studentRepository.findOne(id);
    }

    @Override
    public void updateStudent(Student newStudent) {
        Student student = studentRepository.findOne(newStudent.getId());
        student = newStudent;
        studentRepository.save(student);
    }

    @Override
    public void removeStudent(Student student) {
        studentRepository.delete(student);
    }
}
