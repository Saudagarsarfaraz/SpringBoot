package in.synerzip.service;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import in.synerzip.entity.Account;
import in.synerzip.entity.AccountPk;
import in.synerzip.repository.AccountRepository;


@Service
public class AccountService {
	
	@Autowired
	private AccountRepository accRepository;
	
	public void saveData() {
		
		AccountPk accPk = new AccountPk();
		accPk.setAccId(101);
		accPk.setAccType("Saving");
		accPk.setHolderName("Ash");
		
		Account acc = new Account();
		acc.setBranchName("Pune");
		acc.setMinBalance(20000.00);
	    acc.setAccPk(accPk);	   
	    accRepository.save(acc); 	
		
	}

}
