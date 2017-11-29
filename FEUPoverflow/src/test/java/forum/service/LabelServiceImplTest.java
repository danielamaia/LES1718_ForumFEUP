package forum.service;

import forum.domain.CommentRepository;
import forum.domain.Label;
import forum.domain.LabelRepository;
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
public class LabelServiceImplTest {
    @Inject
    private LabelRepository labelRep;

    @Test
    public void createLabel() throws Exception {

        Label label= new Label();
        String name= "Test";
        label.setName(name);
        Label actualLabel= labelRep.findLabelByName(name);
        Assert.assertEquals(label, actualLabel);

    }

    @Test
    public void getLabelById() throws Exception {
    }

    @Test
    public void updateLabel() throws Exception {
    }

    @Test
    public void removeLabel() throws Exception {
    }

    @Deployment
    public static JavaArchive createDeployment() {
        return ShrinkWrap.create(JavaArchive.class)
                .addClass(LabelServiceImpl.class)
                .addAsManifestResource(EmptyAsset.INSTANCE, "beans.xml");
    }

}
