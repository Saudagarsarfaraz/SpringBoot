package in.synerzip.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import in.synerzip.entity.Address;
import in.synerzip.entity.Employee;
import in.synerzip.repository.AddRepository;
import in.synerzip.repository.EmpRepository;

@Service
public class EmpService {

	@Autowired
	private AddRepository addRepository;

	@Autowired
	private EmpRepository empRepository;

	@Transactional(rollbackFor = Exception.class)
	public void saveData() {

		Employee emp = new Employee();
		emp.setEmpId(114);
		emp.setEmpName("Suresh");
		emp.setEmpSal(3000);
		empRepository.save(emp);

		int i = 10 / 0;

		Address add = new Address();
		add.setAddId(204);
		add.setCity("Latur");
		add.setState("MH");
		add.setCountry("India");
		add.setEmpId(114);
		addRepository.save(add);

	}

}
