package forum.service;

import forum.domain.*;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface PostService {

    void createPost(Post newPost);
    Post getPostById(Long id);
    void updatePost(Post newPost);
    void removePost(Post post);
    List<Post> getPosts();
}
