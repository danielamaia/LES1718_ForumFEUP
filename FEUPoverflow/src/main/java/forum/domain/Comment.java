package forum.domain;


import javax.persistence.*;

@Entity
public class Comment
{

    //auto-gen id
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    private String content;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}