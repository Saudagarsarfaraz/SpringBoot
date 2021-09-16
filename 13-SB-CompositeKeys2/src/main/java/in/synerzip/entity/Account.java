package in.synerzip.entity;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

import javax.persistence.Table;

@Entity
@Table(name = "Account_Name")

public class Account {

	@Column(name = "Branch_Name")
	private String branchName;
	
	@Column(name = "Min_Balance")
	private Double minBalance;
	
	@EmbeddedId
	private AccountPk accPk;

	public String getBranchName() {
		return branchName;
	}

	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}

	public Double getMinBalance() {
		return minBalance;
	}

	public void setMinBalance(Double minBalance) {
		this.minBalance = minBalance;
	}

	public AccountPk getAccPk() {
		return accPk;
	}

	public void setAccPk(AccountPk accPk) {
		this.accPk = accPk;
	}
	
	
	
	
}
