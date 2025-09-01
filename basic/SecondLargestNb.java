package com.rays.basic;

public class SecondLargestNb {
	public static void main(String[] args) {
		 int []a = {1,2,3,4,5,6,6,7,8};
		 
		 int max = 0;
		 int secondmax = 0;
		 
		 for (int i =0 ; i<a.length ; i++) {
			
			if(a[i]>max) {
				 secondmax = max ;
				 max = a[i];
			 } else if(a[i]> secondmax && a[i]!= max) {
				 
			 }
		 }
		 System.out.println("maximum nb is :"  + max);
		 
		System.out.println("secondmax nb is :" + secondmax);
		 
	}
	
}

		 
          