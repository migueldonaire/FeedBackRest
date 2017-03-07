package persistence;

import java.io.Serializable;
import java.util.List;

/**
 * Created by miguel on 7/06/16.
 */
public interface Persistence<T extends Serializable, K> {

    void persist(T item);
    void merge(T item);
    void remove(T item);
    T find(K key);
//    List<T> findAll();
//    boolean removeAll();
}
