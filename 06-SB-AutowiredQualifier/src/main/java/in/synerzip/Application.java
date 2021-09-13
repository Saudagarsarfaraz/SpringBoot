package in.synerzip;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.synerzip.beans.Ireport;
import in.synerzip.beans.IreportService;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext = SpringApplication.run(Application.class, args);
	    IreportService bean = applicationContext.getBean(IreportService.class);
	    bean.generateReport();
	
	}

}
