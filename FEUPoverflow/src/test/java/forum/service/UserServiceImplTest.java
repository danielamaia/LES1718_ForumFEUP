package forum.service;

import forum.domain.Post;
import forum.domain.User;
import forum.domain.UserRepository;
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
public class UserServiceImplTest {
    @Inject
    private UserRepository userRepository;
    @Test
    public void createUser() throws Exception {
        long id= 2013L;
        User user= new User();
        user.setId(id);
        User actualUser=userRepository.findUserById(id);
        Assert.assertEquals(user, actualUser);
    }

    @Test
    public void getUserById() throws Exception {
    }

    @Test
    public void updateUser() throws Exception {
    }

    @Test
    public void removeUser() throws Exception {
    }

    @Deployment
    public static JavaArchive createDeployment() {
        return ShrinkWrap.create(JavaArchive.class)
                .addClass(UserServiceImpl.class)
                .addAsManifestResource(EmptyAsset.INSTANCE, "beans.xml");
    }

}
