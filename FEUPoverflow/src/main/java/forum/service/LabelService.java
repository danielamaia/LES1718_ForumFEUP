package forum.service;

import forum.domain.Label;
import org.springframework.stereotype.Service;

@Service
public interface LabelService {

    void createLabel(Label newLabel);
    Label getLabelById(Long id);
    void updateLabel(Label newLabel);
    void removeLabel(Label label);
}
