package com.rays.racing;

public class AccountThread extends Thread {
	
	static Account a = new Account();
	
	public String name;
	
	public AccountThread(String name) {
		this.name=name;


	}
	@Override
	public void run() {
		for (int i = 1; i <=5; i++) {
			a.deposit(name, 1000);
//			System.out.println(i+name);
		}
	}

}
