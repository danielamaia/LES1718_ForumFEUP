package forum.domain;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Comment
{

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    private String content;

    protected Comment () {}

    public Comment (String content)
    {
        this.content = content;
    }

    @Override
    public String toString() {
        return String.format(
                "Comment[id=%d, content='%s']",
                id, content);
    }
}