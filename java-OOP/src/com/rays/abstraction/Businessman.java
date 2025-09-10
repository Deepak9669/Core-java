package com.rays.oop.abstraction;

public class Businessman extends Person implements Richman,SocialWorker {

	@Override
	public void earnMoney() {
		System.out.println("earn money");
		
	}

	@Override
	public void donation() {
    System.out.println("donation");		
	}

	@Override
	public void party() {
    System.out.println("party");
    
	}
	@Override
	public void helpToOther() {
		System.out.println("help to other");
		
	}
	@Override
	public void getname() {
		System.out.println("Deepak");	}	
}
