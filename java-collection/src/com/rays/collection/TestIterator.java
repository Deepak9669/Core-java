package com.rays.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class TestIterator {
	public static void main(String[] args) {
		
		ArrayList list=new ArrayList();
		
		list.add("Ram");
		list.add("shyam");
		list.add("ritesh");
		list.add("rishabh");
		list.add("deepak");
		
		
		System.out.println("list :"+ list);
		
		System.out.println("_______for each loop__________");
		
		for(Object o : list) {
			System.out.println(o);
		}
		System.out.println("________iterator__________");
		
	   Iterator it=list.iterator();
	   while(it.hasNext()) {
		  Object o=it.next();
	   System.out.println(o);
//	   it.remove();
	   }
	   System.out.println("_______for each methods___________");
	   list.forEach(System.out::println);
	}

}
