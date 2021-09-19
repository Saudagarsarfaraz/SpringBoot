package in.synerzip.controller;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;



@Controller
public class DateController {

	@GetMapping("/date")
	public ModelAndView getDate() {
		ModelAndView mav = new ModelAndView();
		
		//Date d = new Date();
		
		LocalDate now = LocalDate.now();
		LocalTime localTime = LocalTime.now();
		mav.addObject("msg","Todays date :: "+localTime);
		mav.setViewName("index");
        return mav;   		
	}
}
