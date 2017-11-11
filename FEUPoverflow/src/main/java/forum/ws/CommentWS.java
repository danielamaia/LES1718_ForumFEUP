package forum.ws;

import com.fasterxml.jackson.databind.ObjectMapper;
import forum.domain.Comment;
import forum.service.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.inject.Inject;
import java.io.IOException;

@RestController
public class CommentWS {

    @Inject
    private CommentService commentService;
    ObjectMapper objectMapper = new ObjectMapper();

    @RequestMapping(value = "/comment/{id}", method = RequestMethod.GET)
    public ResponseEntity<Comment> getCommentById(@PathVariable Long id){
        Comment comment = commentService.getCommentById(id);
        return new ResponseEntity<>(comment, HttpStatus.OK);
    }

    @RequestMapping(value = "/comment", method = RequestMethod.POST)
    public ResponseEntity<Void> createComment(@RequestBody String commentJson){
        Comment comment = null;
        try {
            comment = objectMapper.readValue(commentJson, Comment.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        commentService.createComment(comment);
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    @RequestMapping(value = "/comment/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<Void> removeComment(@PathVariable Long id){
        Comment comment = commentService.getCommentById(id);
        commentService.removeComment(comment);
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

}