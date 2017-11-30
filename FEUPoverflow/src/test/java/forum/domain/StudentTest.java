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
    public void setId() throws Exception {
    }

    @Test
    public void getFirstName() throws Exception {
    }

    @Test
    public void getLastName() throws Exception {
    }

}