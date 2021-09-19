package in.synerzip.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/book")
public class BookController {

	@GetMapping("/price")
    @ResponseBody
	public String getBookPrice(@RequestParam("isbn") String str) {
	    String msg = "The price of book with "+str+" is 450.00 INR";		
		return msg;	
	}
		
}
