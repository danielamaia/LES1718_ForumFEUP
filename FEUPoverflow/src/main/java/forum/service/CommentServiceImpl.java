package forum.service;

import forum.domain.Comment;
import forum.domain.CommentRepository;
import forum.domain.Student;
import forum.domain.StudentRepository;
import org.springframework.stereotype.Service;

import javax.inject.Inject;

@Service
public class CommentServiceImpl implements CommentService {

    @Inject
    private CommentRepository commentRepository;

    @Override
    public void createComment(Comment newComment) {
        commentRepository.save(newComment);
    }

    @Override
    public Comment getCommentById(Long id) {
        return commentRepository.findOne(id);
    }

    @Override
    public void updateComment(Comment newComment) {
        Comment comment = commentRepository.findOne(newComment.getId());
        comment = newComment;
        commentRepository.save(comment);
    }

    @Override
    public void removeComment(Comment comment) {
        commentRepository.delete(comment);
    }
}
