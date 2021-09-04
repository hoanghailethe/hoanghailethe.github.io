package TodoServer.example.demo.Controller;

import TodoServer.example.demo.Model.Task;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ThymeController {
    @GetMapping("")
    public String home(Model model) {
        model.addAttribute("task", new Task());

        return "index";
    }

}
