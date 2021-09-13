package in.synerzip.utils;

import org.springframework.stereotype.Component;

@Component
public class EmailUtils {
	
	public EmailUtils() {
		System.out.println("EmailUtils :: Constructor");
	}
	
	public void sendingEmail() {
		System.out.println("Sending Email");
	}

}
