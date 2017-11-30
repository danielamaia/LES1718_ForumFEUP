package forum.service;

import forum.domain.Comment;
import forum.domain.CommentRepository;
import org.junit.Assert;
import org.junit.Test;

import javax.inject.Inject;

import static org.junit.Assert.*;

public class CommentServiceImplTest {
    @Inject
    private CommentRepository commentRepository;
    @Test
    public void createComment() throws Exception {
        Comment comment= new Comment();
        //Long id = 12L;
        String content= "Test";
        comment.setContent(content);
        commentRepository.save(comment);
        Comment actualComment= commentRepository.findCommentByContent(content);
        Assert.assertEquals(comment, actualComment);

    }

    @Test
    public void getCommentById() throws Exception {
    }

    @Test
    public void updateComment() throws Exception {
    }

    @Test
    public void removeComment() throws Exception {
    }

}