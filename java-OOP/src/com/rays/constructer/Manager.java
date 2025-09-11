package com.rays.oop.constructer;

public class Manager extends Employee {
	
	public Manager() {
		System.out.println("Manager :Default Constructor");
		
	}
	public Manager(String id,int RagiNo,String hours,String name) {
	   super(id, RagiNo, hours);
	   System.out.println("name :"+name);
	}
	public static void main(String[] args) {
		
		Manager m= new Manager("dev12345", 123456, "8:45 hours", "Deepak");
	}

}
 