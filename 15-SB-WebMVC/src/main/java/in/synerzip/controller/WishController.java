package in.synerzip.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WishController {
	
	@GetMapping("/wish")
	public String getWishMsg(Model model) {
		
		model.addAttribute("msg","God Bless U..!!");
		return "index";
	}

	
	
}
