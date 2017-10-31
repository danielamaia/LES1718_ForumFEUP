package forum.service;

import forum.domain.Student;

import java.util.List;

public interface StudentService {

    void createNewStudent(Student newStudent);
    Student getStudentById(Long id);
    public void updateStudent(Student newStudent);
    void removeStudent(Student student);
}
