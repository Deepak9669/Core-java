package com.rays.stream;

import java.util.ArrayList;
import java.util.List;

public class TestStreamDemo {
	public static void main(String[] args) {
		List<Integer> list= new ArrayList<Integer>();
		
		list.add(10);
		list.add(9);
		list.add(97);
		list.add(8);
	    list.add(7);
		list.add(6);
		list.add(5);
		list.add(5);
		list.add(14);
		
		System.out.println("<_________________>");
		list.stream().filter(o -> o% 2!=0).forEach(System.out::println);
		
		System.out.println("<_________________>");
		list.stream().filter(o -> o%2!=0).sorted().forEach(System.out::println);
		
		System.out.println("<_________________>");
		list.stream().filter(o -> o%2!=0).sorted().distinct().forEach(System.out::println);

		
	
			
		}
	}
	
	



