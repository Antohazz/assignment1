
package com.meritamerica.assignment1;

public class CheckingAccount {
	private double balance = 0.0;
	private final double interestRate = 0.0001;
	private double FV = 0;
	private int years = 0;
	
	
	public CheckingAccount(double checkingAccountopeningBalance) {
		this.balance = checkingAccountopeningBalance; 
	}
	
	public double getBalance() {
		return balance;
	}
	
	public double getInterestRate() {
		return interestRate;
	}
	/*this is to withdraw an amount greater than 0 but with the available funds if not its returns a false  */
	public boolean withdraw(double amount) {
		if(amount > 0 && amount <= balance) {
			balance -= amount;
			System.out.print("Your current blance is now :$");
			return true;
		}else {
			System.out.println("You can not withdraw more than your current balance :$");
			return false;
		}
	}
	/* deposit ammount, it has to be an amount thats greater than 0 of course*/
	public boolean deposit(double amount) {
		
	}
}
//CheckingAccount
//CheckingAccount(double openingBalance)
//double getBalance()
//double getInterestRate()
//boolean withdraw(double amount)
//boolean deposit(double amount)
