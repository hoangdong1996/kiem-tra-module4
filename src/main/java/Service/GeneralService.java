package Service;

import java.util.List;

public interface GeneralService<E> {
    List<E> findAll();

    E findById(Long id);

    void remove(Long id);

    void save(E e);
}
