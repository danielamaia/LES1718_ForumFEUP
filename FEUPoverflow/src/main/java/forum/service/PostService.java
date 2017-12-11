package forum.service;

import forum.domain.*;
import org.springframework.stereotype.Service;

@Service
public interface PostService {

    void createPost(Post newPost);
    Post getPostById(Long id);
    void updatePost(Post newPost);
    void removePost(Post post);
    Iterable<Post> getPosts();
}
