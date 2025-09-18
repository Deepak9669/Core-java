package com.rays.collection.generics;

import java.util.ArrayList;
import java.util.List;

public class TestEmployeeGeneric {
	public static void main(String[] args) {
		
		List<Employee> list = new ArrayList<Employee>();
		
		list.add(new Employee("Rishabh", 100000, "IRIS"));
		list.add(new Employee("ravi", 500000, "rohit"));
		list.add(new Employee("Rishabh", 400000, "IBM"));
		list.add(new Employee("pooja", 500000, "NCS"));
		list.add(new Employee("shivani", 60000, "IBM"));
		list.add(new Employee("lucky", 700000, "NCS"));
		list.add(new Employee("Ritesh", 800000, "NCS"));
		list.add(new Employee("Abhi", 900000, "NCS"));
		list.add(new Employee("mohit", 300000, "NCS"));
		
		System.out.println(list.toString());
		
		System.out.println("____________");
		list.forEach(System.out::println);

		
		
	}

}
