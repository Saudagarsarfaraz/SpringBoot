package in.synerzip.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.synerzip.beans.Car;

@Configuration
public class AppConfig {
     public AppConfig() {
	    System.out.println("Constructor :: Configuration");
	}
     
     @Bean
     public Car car() {
    	Car c = new Car();
    	return c;
     }
     
     
     
}
