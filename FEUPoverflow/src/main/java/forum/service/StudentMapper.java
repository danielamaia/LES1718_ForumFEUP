package forum.service;

import forum.domain.Student;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface StudentMapper {

    StudentMapper INSTANCE = Mappers.getMapper( StudentMapper.class );

    Student toStudent(StudentDTO student);
    @InheritInverseConfiguration
    StudentDTO fromStudent(Student student);

    List<StudentDTO> studentsToStudentDtos(List<Student> students);
}
