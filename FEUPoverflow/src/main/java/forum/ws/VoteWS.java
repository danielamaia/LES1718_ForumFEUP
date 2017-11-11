package forum.ws;

import forum.domain.Student;
import forum.domain.Vote;
import forum.service.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.inject.Inject;

@RestController
public class VoteWS {

    @Inject
    private VoteService voteService;

    @RequestMapping(value = "/vote/{id}", method = RequestMethod.GET)
    public ResponseEntity<Vote> getVoteById(@PathVariable Long id){
        Vote vote = voteService.getVoteById(id);
        return new ResponseEntity<>(vote, HttpStatus.OK);
    }

    @RequestMapping(value = "/vote", method = RequestMethod.POST)
    public ResponseEntity<Void> getStudentById(@RequestBody VoteDTO vote){
        Vote newVote = VoteMapper.INSTANCE.toVote(vote);
        voteService.createVote(newVote);
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    @RequestMapping(value = "/vote/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<Void> removeVote(@PathVariable Long id){
        Vote vote = voteService.getVoteById(id);
        voteService.removeVote(vote);
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

}