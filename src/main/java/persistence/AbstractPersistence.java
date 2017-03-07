package persistence;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.io.Serializable;

/**
 * Created by miguel on 7/06/16.
 */
public abstract class AbstractPersistence<T extends Serializable, K> implements Persistence<T, K> {

    @PersistenceContext(unitName = "MemoryDB")
    EntityManager em;

    public AbstractPersistence() {
        super();
    }

    @Override
    public void persist(T item) {
        em.persist(item);
        em.flush();
    }


    @Override
    public void merge(T item) {
        em.merge(item);
        em.flush();
    }

    @Override
    public void remove(T item) {
        em.remove(em.merge(item));
    }
}
