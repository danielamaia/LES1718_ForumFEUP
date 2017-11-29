package forum.service;

import forum.domain.Comment;
import forum.domain.Post;
import forum.domain.Student;
import forum.domain.StudentRepository;
import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.core.api.annotation.Inject;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.asset.EmptyAsset;
import org.jboss.shrinkwrap.api.spec.JavaArchive;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

@RunWith(Arquillian.class)
public class StudentServiceImplTest {

    @Inject
    private StudentRepository studentRepository;
    @Test
    public void createStudent() throws Exception {


        Student student= new Student();
        long id= 2017L;
        String first="Joao";
        String last="Test";
        student.setId(id);
        Student actualStudent= studentRepository.findById(id);

        Assert.assertEquals(student, actualStudent);
    }

    @Test
    public void getStudentById() throws Exception {
    }

    @Test
    public void updateStudent() throws Exception {
    }

    @Test
    public void removeStudent() throws Exception {
    }

    @Deployment
    public static JavaArchive createDeployment() {
        return ShrinkWrap.create(JavaArchive.class)
                .addClass(StudentServiceImpl.class)
                .addAsManifestResource(EmptyAsset.INSTANCE, "beans.xml");
    }

}
