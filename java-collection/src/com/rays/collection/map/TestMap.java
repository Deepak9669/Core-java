package com.rays.collection.map;

// map can take unique key
// map can only one null key
// map can take multiple null values and multiple duplicate values


import java.util.HashMap;
import java.util.Map;

public class TestMap {
	public static void main(String[] args) {
		
		Map m= new HashMap();
		
		m.put("one", 1);
		m.put("two", 2);
		m.put("three", 3);
		m.put("four", 5);
		m.put("five", 5);
		m.put(null, 5);
		m.put(null, 5);
		
		System.out.println(m);
		System.out.println(m.get("three"));
		System.out.println(m.containsKey("six"));
		System.out.println(m.containsValue(5));
		System.out.println(m.entrySet());
		System.out.println(m.values());
		System.out.println(m.keySet());
		System.out.println(m.size());
		System.out.println(m.remove("five"));
		System.out.println(m);
		
	}
	
	

}
