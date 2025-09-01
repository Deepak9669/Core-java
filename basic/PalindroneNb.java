package com.rays.basic;

public class PalindroneNb {
	public static void main(String[] args) {
		int n = 161;
		int r = 0;
		int sum = 0;
		int temp = n;

		while (temp != 0) {

			r = temp % 10;
			sum = (sum * 10) + r;
			temp = temp / 10;

		}

		System.out.println(sum);
		if (sum == n) {
			System.out.println("this is pelendrome number");

		} else {
			System.out.println("This is nor pelendrome number");
		}

	}

}
