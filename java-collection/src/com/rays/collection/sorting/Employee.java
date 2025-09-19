package com.rays.collection.sorting;

public class Employee {

	public String name;
	 public int salary;
	public String company;

	public Employee(String name, int salary, String company) {
		this.name = name;
		this.salary = salary;
		this.company = company;
	}

	@Override
	public String toString() {
		return " name :" + name + " salary " + salary + " company :" + company;
	}
}
