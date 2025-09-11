package com.rays.oop.constructer;

public class Employee {
	
	public Employee() {
		System.out.println("Employee: Default Constructor");
	}
	public Employee(String id) {
		this();
		System.out.println("id:"+id);
	}
	  public Employee(String id,int RagiNo){
		  this(id);
		  System.out.println("RagiNo :"+RagiNo);
		  
	  }
	  public Employee(String id , int RagiNo,String hours) {
		  this(id, RagiNo);
		  System.out.println("hours :"+hours);
	  }
	  public static void main(String[] args) {
		 
		  Employee e= new Employee("Dev1234", 123456, "8:30 hours");
	}
		
	

}
