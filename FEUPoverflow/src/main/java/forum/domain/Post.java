// tag::sample[]
package forum.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Post {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    private String title;
    private String content;
    private String category;

    protected Post() {}

    public Post(String content, String category) {
        this.content = content;
        this.category = category;
    }

    @Override
    public String toString() {
        return String.format(
                "Post[id=%d, content='%s', title='%s', category='%s']",
                id, content, title, category);
    }
}

