package forum.domain;


import org.springframework.data.repository.CrudRepository;

public interface CommentRepository extends CrudRepository<Comment, Long> {

    Comment findCommentByContent(String content);

}
