package forum.service;

import org.springframework.stereotype.Service;

import forum.domain.Comment;

@Service
public interface CommentService {

    void createComment(Comment newComment);
    Comment getCommentById(Long id);
    void updateComment(Comment newComment);
    void removeComment(Comment comment);
}
