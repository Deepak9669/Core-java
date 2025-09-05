package com.rays.oop.constructer;

public class Account {
	
	private String name;
	private String accountNo;
	private String accountType;
	private double balance;


    public Account(String name,String accountNo,String accountType,double balance) {
    	this.name = name;
    	this.accountNo=accountNo;
    	this.accountType=accountType;
    	this.balance=balance;
    	
    }
       public String getName() {
    	   return this.name;
       }
       public String getAccountNo() {
    	   return this.accountNo;
       }
       public String getAccountType() {
    	   return this.accountType;
       }
       public double getBalance() {
    	   return this.balance;
       }
       
//       deposit method
       public void deposit(double amount ) {
    	   this.balance=this.balance+amount;
    	   System.out.println("Total balance after withdrawal :");
    	   
       }
//       withdrawal method 
       public void withdrawal(double amount) {
    	   if(amount>this.balance) {
    		   System.out.println("insufficent funds");
    		   
    	   } else {
    		   this.balance=this.balance-amount;
    		   System.out.println("amount after withdrawal :"+getBalance());
    	   }
       }
//     method to  fund transfer between account
       
       public void fundTransfer(Account targetAccount ,double amount) {
    	   if(amount>this.balance) {
    		   System.out.println("insuffisent funds :");
    		   
    	   } else {
//    		   withdrawal from current account
    		   this.balance=this.balance-amount;
//    		   deposit into target account
    		   targetAccount.balance=targetAccount.balance+amount;
    		   
    		   System.out.println("transfer"+amount+"from :"+this.accountNo+"to :"+targetAccount.accountNo);
			   System.out.println("your new balance :"+this.getBalance());
			   System.out.println("recevers new balance :"+targetAccount.getBalance());

    	   }
       }
    }















