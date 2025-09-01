package com.rays.basic;

public class SwitchClass {
	public static void main(String[] args) {
		int spin = 4;
		
		switch (spin) {
		case 1:
			System.out.println("price 1 100");
			
			break;
		case 2:
			System.out.println("price 2 100");
			
			break;
		case 3:
			System.out.println("price 3 300");
			
			break;

		default:
			System.out.println("bad luck");
			break;
		}
	}

}
