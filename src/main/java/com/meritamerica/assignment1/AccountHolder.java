package com.meritamerica.assignment1;

public class AccountHolder {
	
	private String firstName = "";
	private String middleName = "";
	private String lastName = "";
	private String ssn = "";
	checkingAccount checkingAccount = null;
    savingsAccount savingsAccount = null;
	
	public AccountHolder() {
		
	}
	
	public AccountHolder(String firstName, String middleName, String lastName, String ssn, double checkingAccountOpeningBalance, double savingsAccountOpeningBalance){
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.ssn = ssn;
		this.checkingAccount = new checkingAccount(checkingAccountOpeningBalance);
		this.savingsAccount = new savingsAccount(savingsAccountOpeningBalance);
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
	public double getCheckingAccountOpeningBalance() {
		return checkingAccountOpeningBalance;
	}
	public void setCheckingAccountOpeningBalance(double checkingAccountOpeningBalance) {
		this.checkingAccountOpeningBalance = checkingAccountOpeningBalance;
	}
	public double getSavingsAccountOpeningBalnce() {
		return savingsAccountOpeningBalnce;
	}
	public void setSavingsAccountOpeningBalnce(double savingsAccountOpeningBalnce) {
		this.savingsAccountOpeningBalnce = savingsAccountOpeningBalnce;
	}
	
	public String toString() {
		
	}
	
	
}

//AccountHolder
//AccountHolder() - default constructor
//AccountHolder(String firstName, String middleName, String lastName, String ssn, double checkingAccountOpeningBalance, double savingsAccountOpeningBalance)
