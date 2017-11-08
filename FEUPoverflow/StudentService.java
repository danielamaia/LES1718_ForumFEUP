package forum.service;

import org.springframework.stereotype.Service;

import forum.domain.Student;

@Service
public interface StudentService {

    void createStudent(Student newStudent);
    Student getStudentById(Long id);
    void updateStudent(Student newStudent);
    void removeStudent(Student student);
}
