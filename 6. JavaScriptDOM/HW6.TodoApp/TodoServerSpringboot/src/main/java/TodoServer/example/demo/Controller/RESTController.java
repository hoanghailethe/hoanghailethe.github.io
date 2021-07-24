package TodoServer.example.demo.Controller;

import TodoServer.example.demo.Model.Task;
import TodoServer.example.demo.Repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(maxAge = 3600)
@RestController
@RequestMapping("/todo")
public class RESTController {

    @Autowired
    TaskRepository taskRepository;

    //CREATE
    @PostMapping("/create")
    //https://stackabuse.com/get-http-post-body-in-spring
    public List<Task> addNewTask(@RequestBody  Task task, BindingResult result) {
        if(!result.hasErrors()){
            String taskTitle = task.getTitle();
            taskRepository.addTask(taskTitle);
        }
        return taskRepository.getAll();
    }

    //READ
    @GetMapping("")
    public List<Task> getAllTasks() {
        return taskRepository.getAll();
    }

    @GetMapping("/{id}")
    public Optional<Task> getTaskById(@PathVariable int id) {
        return taskRepository.find(id);
    }

    //UPdate
    @PutMapping("/update/{id}")
    public List<Task> updateTask(@RequestBody Task task) {
        taskRepository.update(task);
        return taskRepository.getAll();
    }

    //delete
    @GetMapping("/delete/{id}")
    public List<Task> deleteTaskById(@PathVariable int id) {
        taskRepository.delete(id);
        return taskRepository.getAll();
    }

}
