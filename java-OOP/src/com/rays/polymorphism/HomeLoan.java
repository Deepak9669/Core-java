package com.rays.oop.polymorphism;

public class HomeLoan {
	
	public static void main(String[] args) {
		
		Bank [] b = new Bank[3];
		
		b[0]=new AxisBank();
		b[1]=new HDFCBank();
		b[2]=new ICICIBank();
	    loanEnquiry(b);
	}
	static void loanEnquiry(Bank[]banks) {
		for(Bank b:banks) {
			String name = b.getName();
			double rate = b.interestRate();
			System.out.println(name+"="+rate);
	}
	}
}
