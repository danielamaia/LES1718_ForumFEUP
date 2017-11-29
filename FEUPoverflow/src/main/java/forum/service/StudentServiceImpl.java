package forum.service;


import org.springframework.stereotype.Service;

import forum.domain.Student;
import forum.domain.StudentRepository;
import javax.inject.Inject;

@Service
public class StudentServiceImpl implements StudentService {
    @Inject
    private StudentRepository studentRepository;

    @Override
    public void createStudent(Student newStudent) {
        studentRepository.save(newStudent);
    }

    @Override
    public Student getStudentById(Long id) {
        return studentRepository.findOne(id);
    }

    @Override
    public void updateStudent(Student newStudent) {
        studentRepository.save(newStudent);
    }

    @Override
    public void removeStudent(Student student) {
        studentRepository.delete(student);
    }
}
