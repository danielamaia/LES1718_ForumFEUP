package forum.ws;

import com.fasterxml.jackson.databind.ObjectMapper;
import forum.domain.Label;
import forum.service.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.inject.Inject;
import java.io.IOException;

@RestController
public class LabelWS {
    @Inject
    private LabelService labelService;
    ObjectMapper objectMapper = new ObjectMapper();

    @RequestMapping(value = "/label/{id}", method = RequestMethod.GET)
    public ResponseEntity<Label> getLabelById(@PathVariable Long id){
        Label label = labelService.getLabelById(id);
        return new ResponseEntity<>(label, HttpStatus.OK);
    }

    @RequestMapping(value = "/label", method = RequestMethod.POST)
    public ResponseEntity<Void> createLabel(@RequestBody String labelJson){
        Label label = null;
        try {
            label = objectMapper.readValue(labelJson, Label.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        labelService.createLabel(label);
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    @RequestMapping(value = "/label/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<Void> removeLabel(@PathVariable Long id){
        Label label = labelService.getLabelById(id);
        labelService.removeLabel(label);
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

}