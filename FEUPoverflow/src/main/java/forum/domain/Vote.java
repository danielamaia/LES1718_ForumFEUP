// tag::sample[]
package forum.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Vote {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    private Boolean value;

    protected Vote() {}

    public Vote(Boolean value) {
        this.value = value;
    }
    @Override
    public String toString() {

        return String.format(
                "Vote[id=%d, value='%s']",
                id, value);
    }


	public Long getId() {
		return id;
	}

	public Boolean getValue() {
		return value;
	}
}

