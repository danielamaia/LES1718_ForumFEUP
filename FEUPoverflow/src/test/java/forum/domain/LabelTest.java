package forum.domain;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

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

}