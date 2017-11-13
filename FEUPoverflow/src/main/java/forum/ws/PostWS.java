package forum.ws;

import com.fasterxml.jackson.databind.ObjectMapper;
import forum.domain.Post;
import forum.service.PostService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.inject.Inject;
import java.io.IOException;

@Controller
public class PostWS {

    @Inject
    private PostService postService;
    ObjectMapper objectMapper = new ObjectMapper();

    @RequestMapping("/post")
    public String index(@RequestParam(value="title", required=false) String title, Model model) {
        model.addAttribute("title", "usado para passar dados do controlador para o html");
        return "post";
    }

    @RequestMapping(value = "/post/{id}", method = RequestMethod.GET)
    public ResponseEntity<Post> getPostById(@PathVariable Long id){
        Post post = postService.getPostById(id);
        return new ResponseEntity<>(post, HttpStatus.OK);
    }

    @RequestMapping(value = "/post", method = RequestMethod.POST)
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

    @RequestMapping(value = "/post/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<Void> removePost(@PathVariable Long id){
        Post post = postService.getPostById(id);
        postService.removePost(post);
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

}