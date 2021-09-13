package in.synerzip.dao;

import org.springframework.stereotype.Repository;

@Repository
public class UserDao {
  public UserDao() {  
	System.out.println("Constructor :: Dao");
  }
}
