package forum.service;

import forum.domain.CommentRepository;
import forum.domain.Label;
import forum.domain.Post;
import forum.domain.PostRepository;
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
public class PostServiceImplTest {

    @Inject
    private PostRepository postRepository;

    @Test
    public void createPost() throws Exception {

        Post post= new Post();
        String content= "Test";
        post.setContent(content);
        Post actualPost= postRepository.findPostByContent(content);
        Assert.assertEquals(post, actualPost);
    }

    @Test
    public void getPostById() throws Exception {


    }

    @Test
    public void updatePost() throws Exception {
    }

    @Test
    public void removePost() throws Exception {
    }

    @Deployment
    public static JavaArchive createDeployment() {
        return ShrinkWrap.create(JavaArchive.class)
                .addClass(PostServiceImpl.class)
                .addAsManifestResource(EmptyAsset.INSTANCE, "beans.xml");
    }

}
