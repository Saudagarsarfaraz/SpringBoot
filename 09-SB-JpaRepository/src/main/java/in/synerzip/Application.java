package in.synerzip;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.domain.Sort;

import in.synerzip.entity.Employee;
import in.synerzip.repository.EmpRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctxt = SpringApplication.run(Application.class, args);
		EmpRepository bean = ctxt.getBean(EmpRepository.class);
        
		List<Employee> findAll = bean.findAll(Sort.by("empSal").ascending());
		findAll.forEach(emp->System.out.println(emp));
		
		List<Employee> find = bean.findAll(Sort.by("empName").descending());
		find.forEach(emp->System.out.println(emp));
	  
	}

}
