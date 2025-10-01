package com.rays.racing;

public class Account {
	
	private int balance;

	public int getBalance() {
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return balance;
	}

	public void setBalance(int balance)  {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		this.balance = balance;
	}
	public synchronized void deposit(String name,int amount) {
		int total=getBalance();
		total=balance+amount;
		setBalance(total);
		System.out.println(name + " " +" new balance :"+getBalance());
		
	}
	
	

}
