package com.rays.collection.sorting;

import java.util.Comparator;

public class OrderBysalary implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		return o1.salary-o2.salary; 
	}
	

}
