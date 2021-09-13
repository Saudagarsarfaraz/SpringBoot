package in.synerzip.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.synerzip.dao.UserDao;
import in.synerzip.utils.EmailUtils;
import in.synerzip.utils.PwdUtils;

@Service
public class UserService {
	public UserService() {
		System.out.println("UserService :: Constructor");
	}
	
	private PwdUtils pwdUtils;
	
	private EmailUtils emailUtils;
	
	private UserDao userDao;

	@Autowired
	public void setPwdUtils(PwdUtils pwdUtils) {
		this.pwdUtils = pwdUtils;
	}
	
	@Autowired
    public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	@Autowired
	public void setEmailUtils(EmailUtils emailUtils) {
		this.emailUtils = emailUtils;
	}
    
    public void registerUser() {
    	pwdUtils.encryptPwd();
    	userDao.save();
    	emailUtils.sendingEmail();
    	System.out.println("Record Saved!!");
    }
    

}
