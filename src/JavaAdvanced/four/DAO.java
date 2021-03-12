package JavaAdvanced.four;

import java.util.List;

/**
 * CRUD operacije
 * <li>Create</li>
 * <li>Retrieve</li>
 * <li>Update </li>
 * <li>Delete</li>
 * @param <T>
 */
public interface DAO<T> {

    public void create(T record);

    public T update(T record);

    public void delete(T record);

    public T retrieve(int id);

    public List<T> retrieveAll();
}
