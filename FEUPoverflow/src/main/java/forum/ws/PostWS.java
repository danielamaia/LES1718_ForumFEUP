package forum.ws;

import com.fasterxml.jackson.databind.ObjectMapper;
import forum.domain.Post;
import forum.service.PostService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PathVariable;

import javax.inject.Inject;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

@Controller
public class PostWS {

    @Inject
    private PostService postService;
    ObjectMapper objectMapper = new ObjectMapper();

    @RequestMapping("/post")
    public String create(@RequestParam(value="title", required=false) String title, Model model) {
        model.addAttribute("title", "usado para passar dados do controlador para o html");
        return "post-create";
    }

    @RequestMapping("/post/{id}")
    public String read(@PathVariable Long id, Model model) {
        Post post = postService.getPostById(id);
        model.addAttribute(post);
        return "post-read";
    }

    @RequestMapping("/post/index")
    public String index(Model model) {
        Iterable<Post> postsIterable = postService.getPosts();
        model.addAttribute("posts", postsIterable);

        return "post-index";
    }

//    @RequestMapping(value = "/post/{id}", method = RequestMethod.GET)
//    public ResponseEntity<Post> getPostById(@PathVariable Long id){
//        Post post = postService.getPostById(id);
//        return new ResponseEntity<>(post, HttpStatus.OK);
//    }

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

    @RequestMapping(value = "/post", method = RequestMethod.GET)
     public ResponseEntity<List<Post>> readAll(){
                List<Post> posts = postService.getPosts();
                return new ResponseEntity<List<Post>>(posts, HttpStatus.OK);
            }

}