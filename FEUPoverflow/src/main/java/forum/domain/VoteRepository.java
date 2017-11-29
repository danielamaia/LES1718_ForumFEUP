package forum.domain;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface VoteRepository extends CrudRepository<Vote, Long> {
    Vote findVoteById(long id);
}
