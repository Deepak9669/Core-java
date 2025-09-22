package com.rays.stream;

import java.util.ArrayList;
import java.util.List;

public class TestPrimeNo {
	public static boolean prime(int num) {
		if(num==0 || num==1) {
			return false;
		}else if(num==2 || num==3) {
			return true;
		}else {
			for(int i=2; i<=num/2;i++) {
				if(num%i==0) {
					return false;
				}
			}
			return true;
		}
		
	}
	public static void main(String[] args) {
		List<Integer>list=new ArrayList<Integer>();
		
		list.add(1);
		list.add(12);
		list.add(3);
		list.add(4);
		list.add(7);
		list.add(9);
		list.add(11);
		
		list.stream().filter(e -> prime(e)).forEach(System.out::println);
		
	}
}


