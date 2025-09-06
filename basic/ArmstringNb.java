package com.rays.basic;

public class ArmstringNb {
	public static void main(String[] args) {
	      int num = 153;
	      int n = num;
           int r =0;
		  int sum =0;		
		  while(n!=0) {
		   r=n%10;			                                           
		   sum = sum+r*r*r;
		   n=n/10;
			
		}
		if(sum == num) {
			System.out.println("this is armstrong number");
		} else{
			System.out.println("this is not armstrong number");
			
		}
	}			
}