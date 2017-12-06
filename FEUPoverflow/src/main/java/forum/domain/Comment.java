package forum.domain;


import javax.persistence.*;

@Entity
public class Comment
{

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    private String content;
    @ManyToOne (fetch = FetchType.LAZY)
    @JoinColumn(name = "post_id")
    private Post post;

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