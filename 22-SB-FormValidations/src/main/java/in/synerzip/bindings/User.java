package in.synerzip.bindings;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public class User {

	@NotEmpty(message = "Please Enter Username")
	private String uName;
	
	@NotEmpty(message = "Please Enter Password")
	private String pwd;
	
	@NotEmpty(message = "Please Enter Email")
	@Email(message = "Please Enter Valid Email")
	private String email;
	
	@NotNull(message = "Please Enter Phno")
	private Long phno;
	public String getuName() {
		return uName;
	}
	public void setuName(String uName) {
		this.uName = uName;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Long getPhno() {
		return phno;
	}
	public void setPhno(Long phno) {
		this.phno = phno;
	}
	
	
	
}
