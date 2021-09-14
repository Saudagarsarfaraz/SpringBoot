package in.synerzip;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;

import in.synerzip.entity.Employee;
import in.synerzip.repository.EmpRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(Application.class, args);
		EmpRepository bean = run.getBean(EmpRepository.class);
		
		int pageSize = 3;
		int pageNo=4;
		PageRequest pageReq = PageRequest.of(pageNo, pageSize);
		
	    Page<Employee> pageData = bean.findAll(pageReq);
	    int totalPages = pageData.getTotalPages();
	    System.out.println("Total Pages : "+totalPages);
	    
	    List<Employee> list = pageData.getContent();
		
		list.forEach(entity->{
			System.out.println(entity);
		});
		
		
		
		
		
		
	}

}
