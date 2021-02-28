package com.meritamerica.assignment1;

public class MeritAmericaBankApp {
	public static void main(String[] args) {
		AccountHolder accountHolder = new AccountHolder("Gabriel", "Fran" , "Gual" , "123456789" , 100.0, 1000.0);
		System.out.println(accountHolder.toString());
		
		
	}
}
//MeritAmericaBankApp
//public static void main(String[] args)
//Instantiate an account holder with a checkings balance of $100 and a savings balance of $1000
//Display the account holder’s toString() output
//Deposit $500 into the checking account
//Withdraw $800 from the savings account
//Display the checking account toString() output
//Display the savings account toString() output
//Instantiate another account holder with a checkings balance of $200 and a savings balance of $500
//Deposit -$500 into the checking account
//Withdraw $600 from the savings account
//Display the second account holder’s toString() output
