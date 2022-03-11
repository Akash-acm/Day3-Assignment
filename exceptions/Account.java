package com.demo.exceptions;

public class Account {

	private double balance;
	
	public Account(double balance) {
		this.balance=balance;
	}
	public double checkBalance() {
		return this.balance;
	}
	
	public double deposit(double amount) {
		this.balance=this.balance+amount;
		return this.balance;
	}
	public double withdraw(double amount) throws LowBalanceException{
		try {
		if(amount>balance) {
			throw new LowBalanceException("Balance is Low "+this.balance);
		}
		else {
		this.balance=this.balance-amount;
		}
		}catch(LowBalanceException e) {
			System.out.println("Low Balance Exception thrown...");
			throw e;
		}
		System.out.println("This code execute if amount<balance");
		return this.balance;
	
		}
}
