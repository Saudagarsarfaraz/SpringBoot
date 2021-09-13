package in.synerzip.util;

import java.time.LocalDate;

import org.springframework.stereotype.Component;

@Component
public class DateUtil {
	
	public LocalDate date() {
		LocalDate now = LocalDate.now();
		return now;
	}

}
