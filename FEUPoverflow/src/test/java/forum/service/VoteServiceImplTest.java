package forum.service;

import forum.domain.Vote;
import forum.domain.VoteRepository;
import org.junit.Assert;
import org.junit.Test;

import javax.inject.Inject;

import static org.junit.Assert.*;

public class VoteServiceImplTest {
    @Inject
    private VoteRepository voteRepository;
    @Test
    public void createVote() throws Exception {
        Vote vote= new Vote();
        long id= 2017L;
        vote.setId(id);
        Vote actualVote= voteRepository.findVoteById(id);
        Assert.assertEquals(vote, actualVote);
    }

    @Test
    public void getVoteById() throws Exception {
    }

    @Test
    public void updateVote() throws Exception {
    }

    @Test
    public void removeVote() throws Exception {
    }

}