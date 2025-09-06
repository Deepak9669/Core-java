package com.rays.basic;

public class HarmonisSeries {

	public static void main(String[] args) {
		int n = 5;
		double sum = 0.0;

		System.out.print("Harmonic series up to " + n + "terms");
		
		for(int i=1; i<=n; i++) {
			
	    sum +=1.0/i;  // add each terms  
	    System.out.println("1/"+i);
	    
	    if(i<n) {
	    	System.out.print("+");
	    }	
		}
		System.out.println("/n sum of harmonic series ="+sum);
		
		
	

	}

}
