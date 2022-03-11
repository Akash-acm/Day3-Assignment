package com.demo.exceptions;

public class Main {

	public static void main(String[] args) {


		Account a= new Account(5000);
		a.deposit(70);
		a.checkBalance();
		try {
		a.withdraw(600);
		a.withdraw(6000);
		}catch(LowBalanceException e) {
			System.out.println(e.getMessage());
		}

	}

}
