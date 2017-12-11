/*package forum.service;

import forum.domain.Post;
import forum.domain.PostRepository;
import org.junit.Assert;
import org.junit.Test;

import javax.inject.Inject;

import static org.junit.Assert.*;

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

}