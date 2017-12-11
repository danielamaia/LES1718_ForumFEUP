/*package forum.service;

import forum.domain.Label;
import forum.domain.LabelRepository;
import org.junit.Assert;
import org.junit.Test;

import javax.inject.Inject;

import static org.junit.Assert.*;

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

}