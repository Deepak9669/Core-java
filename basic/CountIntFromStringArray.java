package com.rays.basic;

public class CountIntFromStringArray {
	
	public static void main(String[] args) {
		
		String [] str = {"dev96698","ver7645","ma123"};
		int count = 0;
		for(String s: str) {
			for(int i=0 ; i<s.length();i++) {
				if(Character.isDigit(s.charAt(i))) {
					count++;
				}
			}
		}
		System.out.println("count digit ="+count);
	}
}
	

	