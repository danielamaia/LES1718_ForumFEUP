package forum.service;

import forum.domain.Label;
import forum.domain.LabelRepository;
import org.springframework.stereotype.Service;
import javax.inject.Inject;

@Service
public class LabelServiceImpl implements LabelService {

    @Inject
    private LabelRepository labelRepository;

    @Override
    public void createLabel(Label newLabel) {
        labelRepository.save(newLabel);
    }

    @Override
    public Label getLabelById(Long id) {
        return labelRepository.findOne(id);
    }

    @Override
    public void updateLabel(Label newLabel) {
        labelRepository.save(newLabel);
    }

    @Override
    public void removeLabel(Label label) {
        labelRepository.delete(label);
    }
}
