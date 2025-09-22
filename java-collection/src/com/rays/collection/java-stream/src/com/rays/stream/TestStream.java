package com.rays.stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TestStream {
	public static void main(String[] args) {
		List<String> list= new ArrayList<String>();
		
		list.add("virat");
		list.add("rohit");
		list.add("hardik");
		list.add("rahul");
		list.add("virat");
		list.add("shivam");
		list.add("abhishek");
		list.add("mayank");
		list.add("murli");
		
		System.out.println("<________sorted by order____________>");
		list.stream().sorted().forEach(System.out::println);
		
		System.out.println("<________sorted by order____________>");
		list.stream().sorted().distinct().forEach(System.out::println);
		
		System.out.println("<________sorted by order____________>");
		list.stream().sorted(Comparator.reverseOrder()).map(e -> e.toUpperCase()).forEach(System.out::println);

		System.out.println("<________sorted by order____________>");
		list.stream().filter(e -> e.endsWith("t")).sorted().forEach(System.out::println);


	}

}
