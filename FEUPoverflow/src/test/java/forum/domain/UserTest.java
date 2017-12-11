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
    public void getFirstName() throws Exception {
        String expectedFirstName = "Test";
        User user = new User();
        user.setFirstName(expectedFirstName);
        String actualFirstName = user.getFirstName();
        Assert.assertEquals(expectedFirstName, actualFirstName);
    }


    @Test
    public void getLastName() throws Exception {
        String expectedLastName = "Doe";
        User user = new User();
        user.setLastName(expectedLastName);
        String actualLastName = user.getLastName();
        Assert.assertEquals(expectedLastName, actualLastName);
    }

   

    @Test
    public void getNickName() throws Exception {
        String expectedNick = "TestNickName";
        User user = new User();
        user.setNickName(expectedNick);
        String actualNick = user.getNickName();
        Assert.assertEquals(expectedNick, actualNick);
    
    }

    @Test
    public void getEmail() throws Exception {
        String expectedMail = "TestMail";
        User user = new User();
        user.setEmail(expectedMail);
        String actualMail = user.getEmail();
        Assert.assertEquals(expectedMail, actualMail);
    }


    @Test
    public void getPassWord() throws Exception {
        String expectedPass = "TestPass";
        User user = new User();
        user.setPassWord(expectedPass);
        String actualPass = user.getPassWord();
        Assert.assertEquals(expectedPass, actualPass);
    }

   

}
