package in.synerzip.utils;

import org.springframework.stereotype.Component;

@Component
public class PwdUtils {
	public PwdUtils() {
		System.out.println("PwdUtils :: Constructor");
	}
	
	public void encryptPwd() {
		System.out.println("Encrypting the Password");		
	}

}
