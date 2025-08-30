package com.rays.basic;

public class ArrayprcticeClass {
	public static void main(String[] args) {
		float [] marks = {45.54f,55.44f,65.56f,75.57f,85.58f};
		int sum = 0;
		
		for(float element:marks) {
			
			sum = (int) ( sum + element);
			
		}
		System.out.println("the  value of marks is :" + sum);
	

}
}