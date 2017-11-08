package forum.ws;

import forum.domain.Comment;
import forum.domain.Student;
import forum.service.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.inject.Inject;

@RestController
public class CommentWS {

    @Inject
    private CommentService commentService;

    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }

    @RequestMapping(value = "/comment/{id}", method = RequestMethod.GET)
    public ResponseEntity<Comment> getCommentById(@PathVariable Long id){
        Comment comment = commentService.getCommentById(id);
        return new ResponseEntity<>(comment, HttpStatus.OK);
    }

    @RequestMapping(value = "/comment", method = RequestMethod.POST)
    public ResponseEntity<Void> getCommentById(@RequestBody CommentDTO comment){
        Comment newComment = CommentMapper.INSTANCE.toComment(comment);
        commentService.createComment(newComment);
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    @RequestMapping(value = "/commment/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<Void> removeComment(@PathVariable Long id){
        Comment comment = commentService.getCommentById(id);
        commentService.removeComment(comment);
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

}