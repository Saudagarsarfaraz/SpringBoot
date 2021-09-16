package in.synerzip.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.synerzip.entity.InsurancePlan;
import in.synerzip.repository.InsurancePlanRepository;

@Service
public class InsurancePlanService {
	
	@Autowired
	private InsurancePlanRepository insurancePlanRepo;
	
	public void saveData() {
		InsurancePlan plan = new InsurancePlan();
		plan.setPlanName("LIC");
		plan.setPlanStatus("Approved");
		insurancePlanRepo.save(plan);
	}

}
