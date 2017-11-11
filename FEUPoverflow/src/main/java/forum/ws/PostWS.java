package forum.ws;

import com.fasterxml.jackson.databind.ObjectMapper;
import forum.domain.Post;
import forum.service.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.inject.Inject;
import java.io.IOException;

@RestController
public class PostWS {

    @Inject
    private PostService postService;
    ObjectMapper objectMapper = new ObjectMapper();

    @RequestMapping(value = "/pub/{id}", method = RequestMethod.GET)
    public ResponseEntity<Post> getPostById(@PathVariable Long id){
        Post post = postService.getPostById(id);
        return new ResponseEntity<>(post, HttpStatus.OK);
    }

    @RequestMapping(value = "/pub", method = RequestMethod.POST)
    public ResponseEntity<Void> createPost(@RequestBody String postJson){
        Post post = null;
        try {
            post = objectMapper.readValue(postJson, Post.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        postService.createPost(post);
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    @RequestMapping(value = "/pub/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<Void> removePost(@PathVariable Long id){
        Post post = postService.getPostById(id);
        postService.removePost(post);
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

}