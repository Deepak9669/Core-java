package com.rays.java8;
//  through lambda expressin we can create instance of only functional interface
public class TestLambdaExpressionFunctionalInt {

	public static void main(String[] args) {

		HelloFuntionalInt f = () -> {
			System.out.println("hello Lambda Expression");
		};
		f.greeting();

		System.out.println(f.m1(13, 12));//default method is called by object 
		System.out.println(HelloFuntionalInt.m2(14, 14));//called interface name
	}

}
