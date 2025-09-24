package activity13;

public interface Repo<T> {
    void save(T t);
    T findById(String id);
    void delete(String id);
}
