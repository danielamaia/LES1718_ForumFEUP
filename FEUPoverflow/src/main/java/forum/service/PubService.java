package forum.service;

import forum.domain.*;
import org.springframework.stereotype.Service;

@Service
public interface PubService {

    void createPub(Pub newPub);
    Pub getPubById(Long id);
    void updatePub(Pub newPub);
    void removePub(Pub pub);
}
