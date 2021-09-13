package in.synerzip;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.synerzip.entity.Employee;
import in.synerzip.repository.EmpRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctxt = SpringApplication.run(Application.class, args);
		EmpRepository bean = ctxt.getBean(EmpRepository.class);
        Employee findByEmpName = bean.findByEmpName("Ram");
        System.out.println(findByEmpName);
        
        Employee findByEmpSal = bean.findByEmpSal((long) 2000);
        System.out.println(findByEmpSal);
    
        List<Employee> nameAndEmpSal = bean.findByEmpNameAndEmpSal("Rani",3000);
        System.out.println(nameAndEmpSal);
		
        List<Employee> salGreaterThan = bean.findByEmpSalGreaterThan(2000);
        System.out.println(salGreaterThan);
        
        List<Employee> byEmpNameIn = bean.findByEmpNameIn(Arrays.asList("Rani" , "Ram"));
        System.out.println(byEmpNameIn);
        
      Long salByEmpName = bean.findEmpSalByEmpName("Rani");
        System.out.println("Salary ::"+salByEmpName);
        
        Integer count = bean.getCount();
        System.out.println("count :: "+count);
        
	  
	}

}
