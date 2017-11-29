package forum.service;

import forum.domain.Post;
import forum.domain.PostRepository;
import org.springframework.stereotype.Service;
import javax.inject.Inject;

@Service
public class PostServiceImpl implements PostService {

    @Inject
    private PostRepository postRepository;

    @Override
    public void createPost(Post newPost) {
        postRepository.save(newPost);
    }

    @Override
    public Post getPostById(Long id) {
        return postRepository.findOne(id);
    }

    @Override
    public void updatePost(Post newPost) {
        postRepository.save(newPost);
    }

    @Override
    public void removePost(Post post) {
        postRepository.delete(post);
    }
}
