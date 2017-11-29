package forum.service;

import forum.domain.Post;
import forum.domain.StudentRepository;
import forum.domain.Vote;
import forum.domain.VoteRepository;
import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.core.api.annotation.Inject;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.asset.EmptyAsset;
import org.jboss.shrinkwrap.api.spec.JavaArchive;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

@RunWith(Arquillian.class)
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

    @Deployment
    public static JavaArchive createDeployment() {
        return ShrinkWrap.create(JavaArchive.class)
                .addClass(VoteServiceImpl.class)
                .addAsManifestResource(EmptyAsset.INSTANCE, "beans.xml");
    }

}
