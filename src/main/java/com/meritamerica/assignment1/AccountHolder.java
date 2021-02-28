package com.meritamerica.assignment1;

public class AccountHolder {
	
	private String firstName = "";
	private String middleName = "";
	private String lastName = "";
	private String ssn = "";
	CheckingAccount checkingAccount;
	SavingsAccount savingsAccount;
	
	public AccountHolder() {
		
	}
	
	public AccountHolder(String firstName, String middleName, String lastName, String ssn, double checkingAccountOpeningBalance, double savingsAccountOpeningBalance){
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.ssn = ssn;
		this.checkingAccount = new CheckingAccount(checkingAccountOpeningBalance);
		this.savingsAccount = new SavingsAccount(savingsAccountOpeningBalance);
	}
	
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getSsn() {
		return ssn;
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	
	public CheckingAccount getcheckingAccount() {
		return checkingAccount;
	}
	
	public SavingsAccount getsavingsAccount() {
		return savingsAccount;
	}
	
	public String toString() {
		return" Name : "+firstName+" "+middleName+" "+lastName+"\n"+
				"Social Security :"+ssn.toString()+"\n "+
				checkingAccount.toString()+
				savingsAccount.toString()
				;
	}
	
	
}

//AccountHolder
//AccountHolder() - default constructor
//AccountHolder(String firstName, String middleName, String lastName, String ssn, double checkingAccountOpeningBalance, double savingsAccountOpeningBalance)
