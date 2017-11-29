package forum.domain;

import org.springframework.data.repository.CrudRepository;

public interface LabelRepository extends CrudRepository<Label, Long> {
    Label findLabelByName(String name);

}
