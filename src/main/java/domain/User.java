package domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

/**
 * Created by miguel on 06/03/2017.
 */
@Entity
public class User implements Serializable{

    private static final long serialVersionUID = 5745292462058364427L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String fullName;
    private String email;
    private String password;

    @OneToMany
    private List<Project> listProjectAdmin;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
