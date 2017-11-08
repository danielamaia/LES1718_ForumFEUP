package forum.service;

import forum.domain.Pub;
import forum.domain.PubRepository;
import forum.domain.Vote;
import forum.domain.VoteRepository;
import org.springframework.stereotype.Service;

import javax.inject.Inject;

@Service
public class VoteServiceImpl implements VoteService {

    @Inject
    private VoteRepository voteRepository;

    @Override
    public void createVote(Vote newVote) {
        voteRepository.save(newVote);
    }

    @Override
    public Vote getVoteById(Long id) {
        return voteRepository.findOne(id);
    }

    @Override
    public void updateVote(Vote newVote) {
        Vote vote = voteRepository.findOne(newVote.getId());
        vote = newVote;
        voteRepository.save(vote);
    }

    @Override
    public void removeVote(Vote vote) {
        voteRepository.delete(vote);
    }
}
