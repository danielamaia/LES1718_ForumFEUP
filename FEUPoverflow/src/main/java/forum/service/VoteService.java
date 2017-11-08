package forum.service;

import forum.domain.Student;
import forum.domain.Vote;
import org.springframework.stereotype.Service;

@Service
public interface VoteService {

    void createVote(Vote newVote);
    Vote getVoteById(Long id);
    void updateVote(Vote newVote);
    void removeVote(Vote vote);
}
