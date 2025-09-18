package com.rays.collection.list;

import java.util.LinkedList;

public class TestLinkedList {
	public static void main(String[] args) {
		
		LinkedList li = new LinkedList();
		
		
		li.add("deepak");
	    li.add(5);
		li.add(5.2);
		li.add(54.34);
		li.add(null);
		li.add(true);
		
		System.out.println(li);
		System.out.println(li.get(1));
		System.out.println(li.remove(5.1));
		System.out.println(li.set(3, "devil"));
		System.out.println(li);
		System.out.println(li.indexOf(5));
		System.out.println(li.lastIndexOf(null));
		
	}

	}


