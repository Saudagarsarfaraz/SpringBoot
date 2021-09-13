package in.synerzip.dao;

import org.springframework.stereotype.Repository;

@Repository
public class UserDao {
	
	public boolean save(String userName,String email,String pwd) {
		System.out.println("Storing record in database");
		return true;
	}

}
