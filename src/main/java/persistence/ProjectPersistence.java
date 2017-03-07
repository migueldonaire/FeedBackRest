package persistence;

import domain.Project;

import javax.ejb.Stateless;
import javax.persistence.NoResultException;
import javax.persistence.NonUniqueResultException;
import javax.persistence.Query;

/**
 * Created by miguel on 07/03/2017.
 */
@Stateless
public class ProjectPersistence extends AbstractPersistence<Project, Long> {

    public ProjectPersistence() {
        super();
    }

    @Override
    public Project find(Long key) {
        Query q = em.createNamedQuery("buscarProject", Project.class);
        q.setParameter("id", key);
        Project project = (Project) q.getSingleResult();
        return project;
    }
}
