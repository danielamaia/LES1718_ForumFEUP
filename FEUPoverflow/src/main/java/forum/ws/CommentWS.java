package forum.ws;

import com.fasterxml.jackson.databind.ObjectMapper;
import forum.domain.Comment;
import forum.service.CommentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

@RestController
public class CommentWS {

    private CommentService commentService;
    ObjectMapper objectMapper = new ObjectMapper();

    @RequestMapping("/comment")
    public String create(@RequestParam(value="content", required = false) String contet, Model model){
        model.addAttribute("content", "passar dados");
        return "comment-create";
    }

    @RequestMapping("/comment/{id}")
    public String read(@PathVariable Long id, Model model){
        Comment comment = commentService.getCommentById(id);
        model.addAttribute(comment);
        return "comment-read";
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