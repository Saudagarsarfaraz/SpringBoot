package in.synerzip.controller;


import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ProductController {

	@GetMapping(value = {"/","/loadForm"})
	public String loadForm() {
		return "index";
	}
	
	@PostMapping("/saveProduct")
	public String saveData(Model model,HttpServletRequest req) {
		
		String pId = req.getParameter("pId");
		String pName = req.getParameter("pName");
		String pPrice = req.getParameter("pPrice");
		System.out.println("Product Id : "+pId);
		System.out.println("Product Name : "+pName);
		System.out.println("Product Price : "+pPrice);
		model.addAttribute("msg","Product added to catalog successfully...!!!");
		return "success";
	}
}
