package forum.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Label {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    private String name;


    protected Label() {}

    public Label(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return String.format(
                "Student[id=%d, name='%s']",
                id, name);
    }

}

