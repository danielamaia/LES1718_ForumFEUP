package forum.domain;

import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.asset.EmptyAsset;
import org.jboss.shrinkwrap.api.spec.JavaArchive;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

@RunWith(Arquillian.class)
public class CommentTest {
    Long id=175436785L;
    private String content="Test";



    @Test
    public void getId() throws Exception {
        Long expectedId = 12L;
        Comment comment = new Comment();
        comment.setId(expectedId);
        Long actualId = comment.getId();
        Assert.assertEquals(expectedId, actualId);
    }

    @Test
    public void setId() throws Exception {
    }

    @Test
    public void getContent() throws Exception {
    }

    @Test
    public void setContent() throws Exception {
    }

    @Deployment
    public static JavaArchive createDeployment() {
        return ShrinkWrap.create(JavaArchive.class)
                .addClass(Comment.class)
                .addAsManifestResource(EmptyAsset.INSTANCE, "beans.xml");
    }

}




