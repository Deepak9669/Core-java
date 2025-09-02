package com.rays.oop;

public class Account {
	
	private String number;
	private String accountType;
	private double balance;
	
	
	public String getNumber() {
	return this.number;
	}
	
	public void setNumber(String number) {
		this.number = number ;
	}
	public String getaccountType() {
		return this.accountType;
	}
	public void setaccountType(String accountType) {
		this.accountType = accountType;
	}
	public double getBalance() {
		return this.balance;
		
	}
	public void setBalance(double balance) {
		this.balance =balance;
		
	}
	// deposit method
	 public void deposit (double amount) {
		 this.balance=this.balance + amount;
		 System.out.println("total balance after deposit:"+getBalance());
	 }
	    
//	 withdrawal method
	 
	   public void withdrawal(double amount) {
		   if(amount> this.balance) {
			   System.out.println("insufficent fund transfer:");
			   
		   }else {
			   this.balance = this.balance -amount;
				System.out.println("after withdrawal:"+getBalance());

		   }
		
	   }


}
