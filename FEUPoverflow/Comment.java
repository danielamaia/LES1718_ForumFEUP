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
    private String desc;

    protected Comment () {}

    public Comment (String desc)
    {
        this.desc = desc;
    }

    @Override
    public String toString() {
        return String.format(
                "Comment[id=%d, desc='%s']",
                id, desc);
    }

    public Long getId() {
        return id;
    }

    public String getDesc() {
        return desc;
    }

}