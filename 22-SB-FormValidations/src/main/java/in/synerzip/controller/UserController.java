package in.synerzip.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import in.synerzip.bindings.User;

@Controller
public class UserController {
	
	@GetMapping("/loadForm")
	public String loadform(Model model) {
	    
		User user = new User();
		model.addAttribute("user", user);
	     
		return "index";
	}
	
	@PostMapping("/saveData")
	public String saveData(@Valid User user,BindingResult res, Model model) {
		
		if (res.hasErrors()) {
			return "index";			
		}
		
		System.out.println(user);
		
		model.addAttribute("msg", "User Data Saved Successfully");		
		return "dashboard";
	}
	

}
