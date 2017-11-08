package forum.service;

import forum.domain.Comment;
import forum.domain.Student;
import org.springframework.stereotype.Service;

@Service
public interface CommentService {

    void createComment(Comment newComment);
    Comment getCommentById(Long id);
    void updateComment(Comment newComment);
    void removeComment(Comment comment);
}
