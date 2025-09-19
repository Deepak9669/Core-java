package com.rays.collection.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestEmployeeComprator {
	
	public static void main(String[] args) {
		 List<Employee> list=new ArrayList<Employee>();
		 
		 list.add(new Employee("anshul", 1200, "NCS"));
		 list.add(new Employee("lucky", 1300, "TCS"));
		 list.add(new Employee("ajay", 1520, "IRIS"));
		 list.add(new Employee("vijay", 1600, "NAS"));
		 list.add(new Employee("rohit", 1100, "NCS"));
		 list.add(new Employee("mohit", 1800, "DCS"));
		 list.add(new Employee("virat", 10000, "FCS"));
		 
		 OrderByName name=new OrderByName();
		 Collections.sort(list, name);
		 list.forEach(System.out::println);
		 
		 System.out.println("_______________________");
		 
		 OrderBysalary salary = new OrderBysalary();
		 Collections.sort(list, salary);
		 list.forEach(System.out::println);
		 
		 System.out.println("____________________");
		 
		 OrderByCompany company = new OrderByCompany();
		 Collections.sort(list, company);
		 list.forEach(System.out::println);
	}

}
