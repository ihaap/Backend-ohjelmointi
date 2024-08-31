package hh.modelview.controller;

import org.springframework.ui.Model;
import java.util.ArrayList;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import hh.modelview.domain.Student;

@Controller
public class HelloController {
	
	
	// Tehtävä 1
	@GetMapping("hello")
	public String hello(
		@RequestParam(value="name")String name,
		@RequestParam(value="age")int age,
		Model model) {
			model.addAttribute("name", name);
			model.addAttribute("age", age);
			return "hello";
		}
	
	
	// Tehtävä 2
	@GetMapping("students")
	public String students(Model model) {
		ArrayList<Student> students = new ArrayList<>();
		students.add(new Student("Kate", "Cole"));
		students.add(new Student("Dan", "Brown"));
		students.add(new Student("Mike", "Mars"));
		model.addAttribute("students", students);
		return "students";
	}
	
    private ArrayList<String> friendList = new ArrayList<>();
	
	// Tehtävä 3
    @GetMapping("friends")
    public String friends(@RequestParam(name="name", required=false) String name, Model model) {
        if (name != null && !name.isEmpty()) {
            friendList.add(name);
        }
        model.addAttribute("friendList", friendList);
        return "friends";
    }
}	