package domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

/**
 * Created by miguel on 06/03/2017.
 */
@Entity
@NamedQueries({
        @NamedQuery(name = "buscarProject", query = "select p from Project p where p.id = :id")
})
public class Project implements Serializable{
    private static final long serialVersionUID = -3347102535683537698L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    @ManyToOne
    private User adminitrator;
    @OneToMany
    private List<Proposal> listProposals;
    //Type score
    //Token to access
    //path to access program
    //type aplicationclient

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

    public User getAdminitrator() {
        return adminitrator;
    }

    public void setAdminitrator(User adminitrator) {
        this.adminitrator = adminitrator;
    }
}
