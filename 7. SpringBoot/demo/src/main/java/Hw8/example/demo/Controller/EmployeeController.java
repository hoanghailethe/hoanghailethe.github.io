package Hw8.example.demo.Controller;

import Hw8.example.demo.Entity.Employee;
import Hw8.example.demo.Services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping(value="/employee")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    final String mapToThymeleaf = "appName";
    final String employeesList = "employees";

    private String appNameVersion0 = "Staffs Manager";

    //Model ko dung chung dc ResponseEntity
    //review Optional , response and model

    //type Model chi khai bao dc voi string, sau do add va return ve ten file(string) html cua model
    @GetMapping("")
    public String showAllEmployees (Model model) {
        List<Employee> employees =  employeeService.findAll();
        model.addAttribute(employeesList, employees);
        model.addAttribute(mapToThymeleaf, appNameVersion0);
        return "table";
    }

    @GetMapping(value = "/addForm")
    public String newEmployeeRegister(Model model) {
        model.addAttribute(mapToThymeleaf, appNameVersion0);
        model.addAttribute("Employee", new Employee());
        return "addForm";
    }

    @GetMapping(value = "/addForm/{id}")
    public String newEmployeeRegister(Model model, @PathVariable long id) {
        Optional employee = employeeService.get(id);
        model.addAttribute(mapToThymeleaf, appNameVersion0);
        model.addAttribute("Employee", employee);
        return "addForm";
    }

    @PostMapping("/save")
    public String save(Employee employee, BindingResult result) {
        if (result.hasErrors()) {
            return "addForm";
        }
        if (employee.getId() > 0) { // Nếu có trường id có nghĩa là đây là edit form
            employeeService.update(employee);
        } else { // Nếu id ==0 có nghĩa book lần đầu được add
            employeeService.add(employee);
        }
        return "redirect:/employee";
    }
}

