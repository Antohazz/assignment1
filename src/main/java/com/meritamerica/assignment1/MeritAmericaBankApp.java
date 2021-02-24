package com.meritamerica.assignment1;

/*Assignment 1
*This program is a Beta version of Merit America Bank software system.
*It stores the following information about the account holders:
*First Name
*Middle Name
*Last Name
*Social Security Number
*Checking Account
*Savings Account
*
*Program also outputs future value of the account balance based on the interest.
*/


public class MeritAmericaBankApp extends AccountHolder{

	
	public static void main(String[] args) {
		
		/* Instantiates an account holder
		with a checking balance of $100 and a savings balance of $1000*/
		AccountHolder accountHolder = new AccountHolder("John", "James", "Doe", "123-45-6789",
				100, 1000);
		
		//Outputs account info
		accountHolder.toString();
		
		//Deposits $500 into the checking account
		accountHolder.getCheckingAccount().deposit(500.0);
		
		//Withdraws $800 from the savings account
		accountHolder.getSavingsAccount().withdraw(800.0);
		
		//Displays the checking account toString() output
		accountHolder.getCheckingAccount().toString();
		
		//Displays the savings account toString() output
		accountHolder.getSavingsAccount().toString();
	
		
		//Instantiates an account holder with a checking
		//balance of $100 and a savings balance of $1000
		//Display the account holder’s toString() output
		
		AccountHolder accountHolder2 = new AccountHolder("Mary", "Beth", "Brown", "987-65-4321",
				100, 1000);
		accountHolder2.toString();
		
		
		//Instantiate another account holder with a checkings balance of $200 and a savings balance of $500
		//Deposits -$500 into the checking account
		//Withdraws $600 from the savings account
		//Displays the second account holder’s toString() output
		
		AccountHolder accountHolder3 = new AccountHolder("Major", "Major", "Major", "888-88-8888",
				200, 500);
		accountHolder3.getCheckingAccount().deposit(-500.0);
		accountHolder3.getSavingsAccount().withdraw(600);
		accountHolder3.toString();
		
	}
	
	
	
}








