// tag::sample[]
package forum.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Pub {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    private String descP;
    private String category;

    protected Pub() {}

    public Pub(String descP, String category) {
        this.descP = descP;
        this.category = category;
    }

    @Override
    public String toString() {
        return String.format(
                "Pub[id=%d, descP='%s', category='%s']",
                id, descP, category);
    }


	public Long getId() {
		return id;
	}

	public String getDescP() {
		return descP;
	}

	public String getCategory() {
		return category;
	}
}

