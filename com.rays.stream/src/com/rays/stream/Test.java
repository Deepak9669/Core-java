package com.rays.stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Test {
	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<Integer>();
		
		list.add(20000);
		list.add(30000);
		list.add(40000);
		list.add(50000);
		list.add(280000);
		list.add(28000);
		list.add(78000);
		list.add(98000);
		list.add(20000);
		
		System.out.println("<______________________");
		list.stream().sorted().forEach(System.out::println);
		
		System.out.println("<______________________");
		list.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);

		System.out.println("<______________________");
		list.stream().sorted(Comparator.reverseOrder()).limit(1).forEach(System.out::println);
		
		System.out.println("<______________________");
		list.stream().sorted(Comparator.reverseOrder()).skip(2).limit(1).forEach(System.out::println);


	}

}
