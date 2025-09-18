package com.rays.collection.generics;

public class Employee {
	
	private String name;
	private int salary;
	private String company;
	
	public Employee(String name,int salary,String company) {
		this.name=name;
		this.salary=salary;
		this.company=company;
	
	}
	@Override
	public String toString() {
		return ("name: " + name + " salary: " + salary + " company :" +company );
	}

}
