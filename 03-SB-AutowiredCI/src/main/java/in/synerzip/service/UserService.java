package in.synerzip.service;

import org.springframework.stereotype.Service;

import in.synerzip.dao.UserDao;

@Service
public class UserService {
	
	private UserDao userDao;
	
	public UserService(UserDao userDao) {
		super();
		this.userDao = userDao;
	}

	public void registerUser() {
		boolean isSaved = userDao.save("ssaudagar", "ssaudagar88@gmial.com", "8381");
	    if(isSaved) {
	    	System.out.println("record save...");
	    }
	    else {
			System.out.println("failed to save...");
		}
	}
	
	

}
