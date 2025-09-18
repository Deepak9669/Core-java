package com.rays.collection.list;

import java.util.ArrayList;
import java.util.List;

// 1. list can contain multiple duplicate value/element
// 2. list can contain multiple null value/element
// 2. order of list is natural order
public class TestList {
	public static void main(String[] args) {
		
		List list = new ArrayList();
		
		list.add("Deepak");
		list.add(5);
		list.add("Deepak");
		list.add(null);
		list.add(null);
		list.add(true);
		list.add(60.56);
		
		System.out.println("list :"+ list);
		System.out.println(list.get(6));
		System.out.println(list.set(3, "verma "));
		System.out.println(list);
		System.out.println(list.indexOf("verma "));
		System.out.println(list.lastIndexOf("Deepak"));
		System.out.println(list.subList(0, 6));
		
		
		
		
		
	}

}
