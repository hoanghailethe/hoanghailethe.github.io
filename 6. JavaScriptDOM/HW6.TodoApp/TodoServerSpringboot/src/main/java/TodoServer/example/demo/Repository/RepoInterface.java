package TodoServer.example.demo.Repository;

import java.util.List;
import java.util.Optional;

public interface RepoInterface<T, Integer> {

    List<T> getAll();
    abstract void addTask(String title);
    abstract Optional<T> find(int id);
    abstract void update(T o);
    abstract void delete(int id);



}
