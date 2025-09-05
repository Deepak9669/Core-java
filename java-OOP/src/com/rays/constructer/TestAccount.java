package com.rays.oop.constructer;

public class TestAccount {
	
	

	public static void main(String[] args) {
		
		Account a1 = new Account("Deepak","45674356","saving",10000.0);
		
		System.out.println("a1 account name :"+a1.getName());
		System.out.println("a1 account no :"+a1.getAccountNo());
		System.out.println("a1 account type :"+a1.getAccountType());
        System.out.println("a1 balance is :"+a1.getBalance()); 	
        a1.deposit(5000.0);
        a1.withdrawal(5000.0);
        
        System.out.println("_________________");
        
		Account a2 = new Account("Deepak Verma","45674334","current",1000.0);
		
		System.out.println("a1 account name :"+a2.getName());
		System.out.println("a1 account no :"+a2.getAccountNo());
		System.out.println("a1 account type :"+a2.getAccountType());
        System.out.println("a1 balance is :"+a2.getBalance()); 	
        
        a1.fundTransfer(a2, 5000.0);
        
	}

}
