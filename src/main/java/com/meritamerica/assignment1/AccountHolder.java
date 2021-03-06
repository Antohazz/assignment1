package com.meritamerica.assignment1;

/* AccountHolder class for MeritAmericaBankApp.
 * Allows to create new account account.
 * Provides getter and setter methods to access account's properties.
 */


public class AccountHolder {
	
	private String firstName;
	private String middleName;
	private String lastName;
	private String ssn;
	private CheckingAccount checkingAccount;
	private SavingsAccount savingsAccount;

	
	//Constructors
	
	public AccountHolder() {

	}
	
	public AccountHolder (String firstName, String middleName, String lastName, String ssn,
						double checkingAccountOpeningBalance, double savingsAccountOpeningBalance) {

		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.ssn = ssn;
		checkingAccount = new CheckingAccount(checkingAccountOpeningBalance);
		savingsAccount = new SavingsAccount(savingsAccountOpeningBalance);
		
	}
		
	
	//Account GETTERS and SETTERS
	
	//First name setter & getter
	
	protected void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	protected String getFirstName() {
		return firstName; 
	}
	
	
	//Middle name setter & getter
	
	protected void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	protected String getMiddleName() {
		return middleName; 
	}
	
	
	//Last name setter & getter
	
	protected void setLastName(String lastName) {
		this.lastName = lastName;
	}

	protected String getLastName() {
		return lastName; 
	}
	
	//SSN setter & getter
	
	protected void setSSN(String ssn) {
		this.ssn = ssn;
	}

	protected String getSSN() {
		return ssn; 
	}
	

	//Accounts getters
	
	protected CheckingAccount getCheckingAccount() {
		return checkingAccount; 
	}
		
	protected SavingsAccount getSavingsAccount() {
		return savingsAccount; 
	}
	

	// OUTPUT
	// Outputs account info
	public String toString() {
		String accountInfo = "Name: " + getFirstName() + " " + getMiddleName() + " " + getLastName() + "/n" +
				"SSN: " + getSSN() + "/n" +
				"Checking Account Balance: $" + getCheckingAccount().getBalance() + "/n"+
				"Checking Account Interest Rate: " + getCheckingAccount().getInterestRate() +"/n"+
				"Checking Account Balance in 3 years: $" + "/n" +
				"Savings Account Balance: $" + getSavingsAccount().getBalance() + "/n" +
				"Savings Account Interest Rate: " + getSavingsAccount().getInterestRate()+ "/n" +
				"Savings Account Balance in 3 years: $";
		return accountInfo;	
		}
	
}
