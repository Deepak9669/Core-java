package com.rays.exception;

public class  {
	
	public static void main(String[] args) {
		try {
			int a=0;
			int b=15;
			
			int c=b/a;
			System.out.println("div :"+c);
		} catch(ArithmeticException e)  {
			System.out.println("Exceptin :"+e.getMessage());
			e.printStackTrace(); //Disply all error
			System.out.println("program is finished");
					}
	}

}
