package in.synerzip.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "GENDERS")
public class Genders {
	
	@Id
	private Long genderId;
	
	private String genderName;
	
	public Long getGenderId() {
		return genderId;
	}
	public void setGenderId(Long genderId) {
		this.genderId = genderId;
	}
	public String getGenderName() {
		return genderName;
	}
	public void setGenderName(String genderName) {
		this.genderName = genderName;
	}
     
	
}
