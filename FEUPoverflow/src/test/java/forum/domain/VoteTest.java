package forum.domain;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class VoteTest {
    @Test
    public void getId() throws Exception {
        Long expectedId = 12L;
        Vote vote = new Vote();
        vote.setId(expectedId);
        Long actualId = vote.getId();
        Assert.assertEquals(expectedId, actualId);
    }

    @Test
    public void setId() throws Exception {
    }

    @Test
    public void getValue() throws Exception {
    }

    @Test
    public void setValue() throws Exception {
    }

}