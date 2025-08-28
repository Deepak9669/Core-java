package com.rays.basic;

public class LinearSearchpractice {

	public static void main(String[] args) {
		String[] fruits = { "Mango", "Banana", "Orange", "Apple" };
		linearSearch(fruits);
	}

	public static void linearSearch(String[] fruits) {
		String s = "Orange";
		int position = -1;

		for (int i = 0; i < fruits.length; i++) {
			if (s == fruits[i]) {
				position = i;
				System.out.println(s + "=" + position);
			}
		}
		if (position == -1) {
			System.out.println(position);

		}
	}
}
