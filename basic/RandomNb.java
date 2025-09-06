package com.rays.basic;

public class RandomNb {
	public static void main(String[] args) {
		
		int n =5;
		
		for(int i=1;i<=n;i++) {

			int r =  (int) (Math.random()*50); 
			System.out.println(r);
			
		}
	}

}
