package in.synerzip.service;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import in.synerzip.entity.Account;
import in.synerzip.repository.AccountRepository;


@Service
public class AccountService {
	
	@Autowired
	private AccountRepository accRepository;
	
	public void saveData() {
		Account acc = new Account();
		acc.setAccId(101);
		acc.setAccType("saving");
		acc.setBranchName("Pune");
		acc.setHolderName("IBM");
		acc.setMinBalance(20000.00);
	    accRepository.save(acc); 	
		
	}

}
