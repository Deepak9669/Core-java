package com.rays.exception;

public class Account {
	
	
    
    private double balance;

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	public void withdrawal(double amount) throws FundException {
		if(amount>this.balance) {
			throw new FundException("insufisent fund transfer");
			
		}else {
			this.balance=this.balance-amount;
			System.out.println("total balance after widthdeawal");
		}
	}
    


}
