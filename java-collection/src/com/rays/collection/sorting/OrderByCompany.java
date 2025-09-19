package com.rays.collection.sorting;

import java.util.Comparator;

public class OrderByCompany implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		
		return o1.company.compareTo(o2.company);
	}

}
