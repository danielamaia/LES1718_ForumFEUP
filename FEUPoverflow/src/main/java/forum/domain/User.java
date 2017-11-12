// tag::sample[]
package forum.domain;

import javax.persistence.*;

@Entity
@Table(name = "ACCOUNT")
public class User {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    private String firstName;
    private String lastName;
    private String nickName;
    private String email;
    private String passWord;

    protected User() {}

    public User(String firstName, String lastName, String nickName, String email, String passWord) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.nickName = nickName;
        this.email = email;
        this.passWord = passWord;
    }

    @Override
    public String toString() {
        return String.format(
                "Student[id=%d, firstName='%s', lastName='%s',  nickName='%s',  email='%s',  passWord='%s']",
                id, firstName, lastName, nickName, email, passWord);
    }

// end::sample[]

	public Long getId() {
		return id;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}
}

