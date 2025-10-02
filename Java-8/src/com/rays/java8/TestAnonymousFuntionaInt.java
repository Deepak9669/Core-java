package com.rays.java8;
//through Anonymous Function we can create instance of  functional 
//interface as well as normal interface

public class TestAnonymousFuntionaInt {
	
	public static void main(String[] args) {
		
		HelloFuntionalInt h= new HelloFuntionalInt() {
			
			@Override
			public void greeting() {
				System.out.println("Hello anonymous");
			}
		};
		h.greeting();
	}

}
