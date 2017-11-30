package forum.domain;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class UserTest {
    @Test
    public void getId() throws Exception {

        Long expectedId = 12L;
        User user = new User();
        user.setId(expectedId);
        Long actualId = user.getId();
        Assert.assertEquals(expectedId, actualId);
    }

    @Test
    public void setId() throws Exception {
    }

    @Test
    public void getFirstName() throws Exception {
    }

    @Test
    public void setFirstName() throws Exception {
    }

    @Test
    public void getLastName() throws Exception {
    }

    @Test
    public void setLastName() throws Exception {
    }

    @Test
    public void getNickName() throws Exception {
    }

    @Test
    public void setNickName() throws Exception {
    }

    @Test
    public void getEmail() throws Exception {
    }

    @Test
    public void setEmail() throws Exception {
    }

    @Test
    public void getPassWord() throws Exception {
    }

    @Test
    public void setPassWord() throws Exception {
    }

}