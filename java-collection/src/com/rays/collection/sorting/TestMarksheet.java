package com.rays.collection.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestMarksheet {
	public static void main(String[] args) {
		
		List<Marksheet> list=new ArrayList<Marksheet>();
		
		list.add(new Marksheet("rishabh", "1234523",96));
		list.add(new Marksheet("Deepak", "1234511",86));
		list.add(new Marksheet("sumit", "1234512",76));
		list.add(new Marksheet("Amit", "1234517",66));
		list.add(new Marksheet("ravi", "1234516",56));
		
		System.out.println(list);
		System.out.println("_______________");
		Collections.sort(list);
		list.forEach(System.out::println);
		System.out.println("_____________");
		Collections.sort(list);
		list.forEach(System.out::println);
		System.out.println("______________");
		System.out.println(list);
		Collections.sort(list);
		list.forEach(System.out::println);

		
	}

}
