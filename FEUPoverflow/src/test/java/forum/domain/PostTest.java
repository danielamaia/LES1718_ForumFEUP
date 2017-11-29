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
public class PostTest {
    @Test
    public void getId() throws Exception {
        Long expectedId = 12L;
        Post post = new Post();
        post.setId(expectedId);
        Long actualId = post.getId();
        Assert.assertEquals(expectedId, actualId);
    }

    @Test
    public void setId() throws Exception {
    }

    @Test
    public void getTitle() throws Exception {
    }

    @Test
    public void setTitle() throws Exception {
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
                .addClass(Post.class)
                .addAsManifestResource(EmptyAsset.INSTANCE, "beans.xml");
    }

}
