package com.meritamerica.assignment1;

public class SavingsAccount {
	private double balance = 0.0;
	private final double interestRate = 0.0001;
	private double futureValue = 0;
	private int years = 0;
	
	
	public SavingsAccount(double savingsAccountopeningBalance) {
		this.balance = savingsAccountopeningBalance; 
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
	/* deposit amount, it has to be an amount thats greater than 0 of course*/
	public boolean deposit(double amount) {
		if(amount > 0) {
			balance += amount;
			System.out.println("You current balance is now :$");
			return true;
		}else {
			System.out.println("You can not deposit an amount less then zero!");
			return false;
		}
	}
	
	public double futureValue(int years) {
		double value = 0.00;
		this.years = years;
		double powered = Math.pow(1 + interestRate, years);
		value = balance = powered;
		futureValue = value;
		return futureValue;
	}
	
	public String toString() {
		double futureValue = futureValue(years);
		return "Savings Account Balance: "+balance+
				"\n Savings Account Interest Rate" +interestRate+
				"\n Savings Account Balance in years: "+years+"years: "+futureValue;
	}
	
	
	
}