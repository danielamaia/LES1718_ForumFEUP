package forum.service;

import forum.domain.Post;
import forum.domain.PostRepository;
import org.springframework.stereotype.Service;


@Service
public class PostServiceImpl implements PostService {


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
