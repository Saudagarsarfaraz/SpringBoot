package in.synerzip.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class carController {

	@GetMapping("/price/{cname}")
	@ResponseBody
	public String getCarprice(@PathVariable("cname") String carName) {
		String msg = carName + " Price is 7.78 lakhs";
		return msg;
	}
	
	@GetMapping("/carDetails/{carName}/{location}/{branch}")
	@ResponseBody
	public String getCarDtls(@PathVariable String carName, 
			@PathVariable String location, @PathVariable String branch) {
		String responseMsg = "In " + location + " " + branch + " Branch " + carName + " Cars are available";
		return responseMsg;		
	}
	
	
}
