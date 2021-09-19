package in.synerzip.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BookController {

	@GetMapping("/bookdata")
	public String getBookData(Model model) {
		model.addAttribute("bookId","ISBN:101");
		model.addAttribute("bookName","Advaced Java");
		model.addAttribute("bookPrice","450 INR.");
		return "book-data";
	}
	
}
