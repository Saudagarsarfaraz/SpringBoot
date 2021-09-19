package in.synerzip.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import in.synerzip.bindings.Student;
import in.synerzip.service.StudentService;

@Controller
public class StudentController {

	@Autowired
	private StudentService studentService;
    
	
	@GetMapping("/loadForm")
	public String loadFrom(Model model) {
		model.addAttribute("genders", studentService.getGenders());
		model.addAttribute("courses", studentService.getCourses());
		model.addAttribute("timings", studentService.getTimings());
		
		Student stud = new Student();
		model.addAttribute("student", stud);
		
		return "index";	
	}
	
	@PostMapping("/saveData")
	public String saveData(Model model) {
			
		model.addAttribute("msg", "Registration form submitted successfully...!!!");
		return "dash-board";
	}





}

