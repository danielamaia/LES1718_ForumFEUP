package forum.service;

import forum.domain.Pub;
import forum.domain.PubRepository;
import forum.domain.Pub;
import forum.domain.PubRepository;
import org.springframework.stereotype.Service;

import javax.inject.Inject;

@Service
public class PubServiceImpl implements PubService {

    @Inject
    private PubRepository pubRepository;

    @Override
    public void createPub(Pub newPub) {
        pubRepository.save(newPub);
    }

    @Override
    public Pub getPubById(Long id) {
        return pubRepository.findOne(id);
    }

    @Override
    public void updatePub(Pub newPub) {
        Pub pub = pubRepository.findOne(newPub.getId());
        pub = newPub;
        pubRepository.save(pub);
    }

    @Override
    public void removePub(Pub pub) {
        pubRepository.delete(pub);
    }
}
