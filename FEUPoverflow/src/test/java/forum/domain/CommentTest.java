package forum.domain;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CommentTest {
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
         String expectedContent = "test";
        Comment comment = new Comment();
        comment.setContent(expectedContent);
        String actualContent = comment.getContent();
        Assert.assertEquals(expectedContent, actualContent);
    }

    @Test
    public void setContent() throws Exception {
    }

}
