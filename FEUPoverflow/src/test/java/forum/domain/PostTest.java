package forum.domain;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

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
    public void getTitle() throws Exception {
    }

  

    @Test
    public void getContent() throws Exception {
         String expectedContent = "test";
        Post post = new Post();
        post.setContent(expectedContent);
        String actualContent = post.getContent();
        Assert.assertEquals(expectedContent, actualContent);
    
    }

   

}
