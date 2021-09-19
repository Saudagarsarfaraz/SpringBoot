package in.synerzip.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import in.synerzip.pojo.InsurancePlan;

@Controller
public class InsurancePlanController {

	@GetMapping("/insurancePlan")
	@ResponseBody
	public InsurancePlan getInsurancePlanData(Model model) {
           
		 InsurancePlan plan = new InsurancePlan();
		 plan.setPlanId(101);
		 plan.setPlanName("Jeeva Anand");
		 plan.setPlanStatus("Approved");
		 
		 return plan;		
	   }	
	}

