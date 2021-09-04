package TodoServer.example.demo.Controller;

import TodoServer.example.demo.Model.Task;
import TodoServer.example.demo.Repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
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
    public Task addNewTask(@RequestBody  Task task, BindingResult result) {
        if(!result.hasErrors()){
            String taskTitle = task.getTitle();
            taskRepository.addTask(taskTitle);
        }
        //chi tra ve mot doi tuong
        return task;
    }

    //READ - Khi mới vào sẽ load Dữ liệu từ đây
    @GetMapping("")
    public List<Task> getAllTasks() {
        return taskRepository.getAll();
    }

    @GetMapping("/{id}")
    public Optional<Task> getTaskById(@PathVariable int id) {
        return taskRepository.find(id);
    }

    //UPdate xong chi can tra ve thong bao la done
    @PutMapping("/update/{id}")
    public String updateTaskStatus(@RequestBody Task task) {
        taskRepository.updateStatus(task);
        return "update success";
    }

    //delete xong thi tra ve thong bao thanh cong
    @GetMapping("/delete/{id}")
    public String deleteTaskById(@PathVariable int id) {
        taskRepository.delete(id);
        return "Delete success";
    }

}
