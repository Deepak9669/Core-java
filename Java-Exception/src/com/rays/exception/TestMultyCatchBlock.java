package com.rays.exception;

public class TestMultyCatchBlock {
	
	public static void main(String[] args) {
		try {
			String str="deepak";
			System.out.println(str.length());
			System.out.println(str.charAt(6));
		} catch (NullPointerException e){
			System.out.println("Exception1 :"+e.getMessage());
		}catch (IndexOutOfBoundsException e) {
			System.out.println("Exeptin :"+e.getMessage());
		}finally {
			System.out.println("program is finished");
		}
	}

}
