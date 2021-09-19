package in.synerzip.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class CourseController {

	@GetMapping("/course")
	@ResponseBody
	public String getCourseDtls(String cname,String trainer ) {
	   if(cname.equals("SBMS")){
		String msg = cname+" will start at 6:00 pm by "+trainer;
		return msg;
	   }else if(cname.equals("JTRP")) {
		   String msg = cname+" will start at 6:00 pm by "+trainer;
			return msg; 
	   }
	   return "Contact Admin team:9607175443";		
	}
}
