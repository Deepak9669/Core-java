package com.rays.oop.abstraction;

public class TestBussinessman {
	
	public static void main(String[] args) {
		
		Richman r = new Businessman();
		
		r.earnMoney();
		r.donation();
		r.party();
		
		SocialWorker s = new Businessman();
		s.helpToOther();
		
    	Businessman b = new Businessman();
		
		Person P = new Businessman();
		P.getname();
		
		
          
		
	}

}
