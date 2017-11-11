package forum.ws;

import com.fasterxml.jackson.databind.ObjectMapper;
import forum.domain.Vote;
import forum.service.VoteService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.inject.Inject;
import java.io.IOException;

@RestController
public class VoteWS {

    @Inject
    private VoteService voteService;
    ObjectMapper objectMapper = new ObjectMapper();


    @RequestMapping(value = "/vote/{id}", method = RequestMethod.GET)
    public ResponseEntity<Vote> getVoteById(@PathVariable Long id){
        Vote vote = voteService.getVoteById(id);
        return new ResponseEntity<>(vote, HttpStatus.OK);
    }

    @RequestMapping(value = "/vote", method = RequestMethod.POST)
    public ResponseEntity<Void> createVote(@RequestBody String voteJson){
        Vote vote = null;
        try {
            vote = objectMapper.readValue(voteJson, Vote.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        voteService.createVote(vote);
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    @RequestMapping(value = "/vote/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<Void> removeVote(@PathVariable Long id){
        Vote vote = voteService.getVoteById(id);
        voteService.removeVote(vote);
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

}