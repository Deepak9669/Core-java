package com.rays.basic;

public class CountDigitFromString {
	public static void main(String[] args) {
		String str = "adg12vbn43n";
		int count =0;
		
		for(int i=0 ;i<str.length(); i++) {
			if(Character.isDigit(str.charAt(i))) {
				System.out.println(str.charAt(i));
				count++;
				
			}
			
			
		}
		System.out.println("total digit is"+ " "+count);
		
		
	}
}
		
	