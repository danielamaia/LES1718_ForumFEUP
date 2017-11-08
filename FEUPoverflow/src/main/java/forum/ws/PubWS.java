package forum.ws;

import forum.domain.Pub;
import forum.domain.Pub;
import forum.service.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.inject.Inject;

@RestController
public class PubWS {

    @Inject
    private PubService pubService;

    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }

    @RequestMapping(value = "/pub/{id}", method = RequestMethod.GET)
    public ResponseEntity<Pub> getPubById(@PathVariable Long id){
        Pub pub = pubService.getPubById(id);
        return new ResponseEntity<>(pub, HttpStatus.OK);
    }

    @RequestMapping(value = "/pub", method = RequestMethod.POST)
    public ResponseEntity<Void> getPubById(@RequestBody PubDTO pub){
        Pub newPub = PubMapper.INSTANCE.toPub(pub);
        pubService.createPub(newPub);
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    @RequestMapping(value = "/pub/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<Void> removePub(@PathVariable Long id){
        Pub pub = pubService.getPubById(id);
        pubService.removePub(pub);
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

}