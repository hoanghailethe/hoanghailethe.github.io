package TodoServer.example.demo.Repository;

import TodoServer.example.demo.Model.Task;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class TaskRepository implements RepoInterface<Task, Integer>{
    ArrayList<Task> tasks = new ArrayList<>();

    public TaskRepository() {
        tasks.add(new Task(1, "đi ăn", false));
        tasks.add(new Task(2, "đi chơi", false));
        tasks.add(new Task(3, "shopping", false));
        tasks.add(new Task(4, "đá banh", false ));
    }

    @Override
    public List<Task> getAll() {
        return tasks;
    }

    @Override
    public void addTask(String taskTitle) {
        int id = tasks.size()+1;
        Task newTask = new Task(id, taskTitle, false);
        tasks.add(newTask);
    }

    @Override
    public Optional<Task> find(int id) {
        return tasks.stream().filter(t -> t.getId() == id).findAny();
    }

    @Override
    public void updateStatus(Task o) {
        System.out.println(o.getId());
        find(o.getId()).ifPresent(t -> {
            t.setCompleted(true);
            System.out.println(t.isCompleted());
        });
    }

    @Override
    public void delete(int id) {
        Task task = find(id).get();
        if (task !=null) {
            tasks.remove(task);
        }
    }
}
