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
public class LabelTest {
    @Test
    public void getId() throws Exception {

        Long expectedId = 10L;
        Label label = new Label();
        label.setId(expectedId);
        Long actualId = label.getId();
        Assert.assertEquals(expectedId, actualId);

    }

    @Test
    public void setId() throws Exception {
    }

    @Test
    public void getName() throws Exception {
    }

    @Test
    public void setName() throws Exception {
    }

    @Deployment
    public static JavaArchive createDeployment() {
        return ShrinkWrap.create(JavaArchive.class)
                .addClass(Label.class)
                .addAsManifestResource(EmptyAsset.INSTANCE, "beans.xml");
    }

}
