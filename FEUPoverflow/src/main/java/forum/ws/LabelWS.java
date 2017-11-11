package forum.ws;

import forum.domain.Label;
import forum.domain.Vote;
import forum.service.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.inject.Inject;

@RestController
public class LabelWS {

    @Inject
    private LabelService labelService;


    @RequestMapping(value = "/label/{id}", method = RequestMethod.GET)
    public ResponseEntity<Label> getLabelById(@PathVariable Long id){
        Label label = labelService.getLabelById(id);
        return new ResponseEntity<>(label, HttpStatus.OK);
    }

    @RequestMapping(value = "/label", method = RequestMethod.POST)
    public ResponseEntity<Void> getLabelById(@RequestBody LabelDTO label){
        Label newLabel = LabelMapper.INSTANCE.toLabel(label);
        labelService.createLabel(newLabel);
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    @RequestMapping(value = "/label/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<Void> removeLabel(@PathVariable Long id){
        Label label = labelService.getLabelById(id);
        labelService.removeLabel(label);
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

}