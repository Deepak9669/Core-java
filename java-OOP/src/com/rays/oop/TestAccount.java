package com.rays.oopEncapsulation;

import com.rays.oopEncapsulation.Account;;

public class TestAccount {
	

	public static void main(String[] args) {
		
		Account a1 = new Account();
		
		a1.setNumber("4352627765");
		a1.setaccountType("current");
		a1.setBalance(500.00);
		
		System.out.println("a1 accountnumber :"+a1.getNumber());
		System.out.println("a1 account type :"+a1.getaccountType());
		System.out.println("a1 account balance :"+a1.getBalance());
		a1.deposit(1000.00);
		a1.withdrawal(200.00);
		
	
		System.out.println("_____________");
		
	    Account Deepak = new Account();
	    
	      Deepak.setNumber("4356789");
	      Deepak.setaccountType("saving");
	      Deepak.setBalance(1000.00);
	      
	      
	       System.out.println(Deepak.getNumber());
	       System.out.println(Deepak.getaccountType());
	       System.out.println(Deepak.getBalance());
	       Deepak.deposit(5000.00);
	       Deepak.withdrawal(5000.00);
	       
	       a1.fundTransfer(Deepak, 1000);
		
		
	}


}
