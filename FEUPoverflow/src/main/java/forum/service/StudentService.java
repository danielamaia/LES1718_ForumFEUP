package forum.service;

import forum.domain.Student;

import java.util.List;

public interface StudentService {

    void createStudent(Student newStudent);
    Student getStudentById(Long id);
    void updateStudent(Student newStudent);
    void removeStudent(Student student);
}
