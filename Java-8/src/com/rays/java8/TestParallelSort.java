package com.rays.java8;

import java.util.Arrays;
import java.util.Comparator;

public class TestParallelSort {
	public static void main(String[] args) {
		int [] a = {9,2,4,6,3,5,4,1};
		
		Arrays.parallelSort(a);
		for (int i : a) {
			System.out.println(i);
			
		}
		
		System.out.println("<----------------->");
		Integer [] j= {9,2,4,6,3,5,4,1};
		Arrays.parallelSort(j,Comparator.reverseOrder());
		for (int i : j) {
			System.out.println(i);
			
		}

	}

}
