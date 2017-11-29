package forum.domain;

import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.asset.EmptyAsset;
import org.jboss.shrinkwrap.api.spec.JavaArchive;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

@RunWith(Arquillian.class)
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

    @Deployment
    public static JavaArchive createDeployment() {
        return ShrinkWrap.create(JavaArchive.class)
                .addClass(Student.class)
                .addAsManifestResource(EmptyAsset.INSTANCE, "beans.xml");
    }

}
