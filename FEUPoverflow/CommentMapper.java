package forum.service;

import forum.domain.Comment;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface CommentMapper {

    CommentMapper INSTANCE = Mappers.getMapper(CommentMapper.class);

    Comment toComment(CommentDTO comment);
    @InheritInverseConfiguration
    CommentDTO fromCooment(Comment comment);

    List<CommentDTO> commentsToCommentDtos(List<Comment> comments);
}
