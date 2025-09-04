package com.rays.basic;

public class SecontHightNb {
	public static void main(String[] args) {
		int [] a =  {10,20,30,40,50};
		int max = 0;
        int secondmax = 0;
		
		
		for(int i = 0; i<a.length; i++) {
			if(a[i]>max) {

			secondmax =max;
				max =a[i];
				
				
			}else if (a[i]>secondmax  && a[i] != max) {
				
			}
			
		}
//		System.out.println("maximum nb is :"+max);
       System.out.println("second max nb is:"+secondmax);
		
				
		
		
	}

}
