package forum.service;

import forum.domain.Student;
import forum.domain.User;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface UserMapper {

    UserMapper INSTANCE = Mappers.getMapper( UserMapper.class );

    User toUser(UserDTO user);
    @InheritInverseConfiguration
    UserDTO fromUser(User user);

    List<UserDTO> usersToUserDtos(List<User> users);
}
