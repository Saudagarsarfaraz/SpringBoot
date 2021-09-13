package in.synerzip;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.synerzip.entity.EMP_TBL;
import in.synerzip.repository.EmpRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctxt = SpringApplication.run(Application.class, args);
		EmpRepository bean = ctxt.getBean(EmpRepository.class);
	    
		/*EMP_TBL emp1 = new EMP_TBL(101,"Ram",2000); 
		EMP_TBL emp2 = new EMP_TBL(102,"Rani",3000);
		EMP_TBL emp3 = new EMP_TBL(103,"Raja",4000);
	   
		List<EMP_TBL> emp = Arrays.asList(emp1,emp2,emp3);
		emp.forEach(e->System.out.println(e));
		bean.saveAll(emp);*/
		
		/*Optional<EMP_TBL> findById = bean.findById((long) 103);
		if(findById.isPresent()) {
			System.out.println("Record found!!");			
		}else {
			System.out.println("Recrd not found!!");
		}*/
		
		/*
		 * List<Long> empIds = new ArrayList<>(); empIds.add((long) 101);
		 * empIds.add((long) 102); empIds.add((long) 103);
		 * 
		 * List<EMP_TBL> findAllById = bean.findAllById(empIds);
		 * findAllById.forEach(e->System.out.println(e));
		 * 
		 * long count = bean.count(); System.out.println(count);
		 */
		
		boolean existsById = bean.existsById((long) 102);
		System.out.println(existsById);
		
		bean.deleteById((long) 103);
	}

}
