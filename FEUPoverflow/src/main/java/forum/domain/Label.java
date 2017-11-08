// tag::sample[]
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
    private String category;
    private String descri;

    protected Label() {}

    public Label(String name, String category, String descri) {
        this.name = name;
        this.category = category;
        this.descri = descri;
    }

    @Override
    public String toString() {
        return String.format(
                "Student[id=%d, name='%s', category='%s',  descri='%s']",
                id, name, category, descri);
    }

// end::sample[]

	public Long getId() {
		return id;
	}
}

