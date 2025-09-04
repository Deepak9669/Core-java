package com.rays.basic;

public class FactorialClass {
	public static void main(String[] args) {
		int n = 40;
				
		 long factorial = 1;
		 System.out.println(n);
		 
		 
		 for(int i =1 ; i<=n;i++) {
			 factorial*=i;
			 System.out.println(i+"!="+factorial);
		 }
		
	}

}
