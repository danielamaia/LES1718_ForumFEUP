package forum.domain;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class StudentTest {
    @Test
    public void getId() throws Exception {
        Long expectedId = 12L;
        Student stu = new Student();
        stu.setId(expectedId);
        Long actualId = stu.getId();
        Assert.assertEquals(expectedId, actualId);
    }

  
    @Test
    public void getFirstName() throws Exception {
        String expectedFirstName = "Test";
        Student stu = new Student();
        stu.setFirstName(expectedFirstName);
        String actualFirstName = stu.getFirstName();
        Assert.assertEquals(expectedFirstName, actualFirstName);
    }

    @Test
    public void getLastName() throws Exception {
        String expectedLastName = "Doe";
        Student stu = new Student();
        stu.setLastName(expectedLastName);
        String actualLastName = stu.getLastName();
        Assert.assertEquals(expectedLastName, actualLastName);
    }
    

}
