package com.rays.exception;

public class TestAccountException {
	
	public static void main(String[] args) throws FundException  {
		
		Account a= new Account();
		a.setBalance(5000);
		a.withdrawal(5800);
	}

}
