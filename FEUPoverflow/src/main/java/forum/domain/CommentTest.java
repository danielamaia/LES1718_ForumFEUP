package forum.domain;

import junit.framework.TestCase;
import org.junit.Assert;

public class CommentTest extends TestCase {
    Long id;
    private String content;


    public void setUp() throws Exception {
        super.setUp();
        id= 175436785L;
        content="Test";
    }

    public void tearDown() throws Exception {
    }

    public void testGetId() throws Exception {
        Long expectedId = 12L;
        Comment comment = new Comment();
        comment.setId(expectedId);
        Long actualId = comment.getId();
        Assert.assertEquals(expectedId, actualId);
    }

    public void testSetId() throws Exception {
    }

    public void testGetContent() throws Exception {

        //Assert.assertEquals(content, );
    }

    public void testSetContent() throws Exception {
    }

}
