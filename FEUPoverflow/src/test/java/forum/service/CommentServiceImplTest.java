package forum.service;

import forum.domain.Comment;
import forum.domain.CommentRepository;
import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.core.api.annotation.Inject;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.asset.EmptyAsset;
import org.jboss.shrinkwrap.api.spec.JavaArchive;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

@RunWith(Arquillian.class)
public class CommentServiceImplTest {
    @Inject
    private CommentRepository commentRepository;

    @Test
    public void createComment() throws Exception {
        Comment comment= new Comment();
        //Long id = 12L;
        String content= "Test";
        comment.setContent(content);
        System.err.println(commentRepository);
        System.err.println(comment);
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

    @Deployment
    public static JavaArchive createDeployment() {
        return ShrinkWrap.create(JavaArchive.class)
                .addClass(CommentServiceImpl.class)
                .addAsManifestResource(EmptyAsset.INSTANCE, "beans.xml");
    }

}
