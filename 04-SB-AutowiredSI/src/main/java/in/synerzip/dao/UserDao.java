package in.synerzip.dao;

import org.springframework.stereotype.Repository;

@Repository
public class UserDao {
	
	public UserDao() {
		System.out.println("UserDao :: Constructor");
	}
	
	public void save() {
		System.out.println("Saving record");
	}

}
