package com.rays.exception;

public class TestParentsException {
	public static void main(String[] args) {
		try {
			String str="deepak";
			System.out.println(str.length());
			System.out.println(str.charAt(6));
		} catch (Exception e){
			System.out.println("Exception1 :"+e.getMessage());
			e.printStackTrace();
		}finally {
			System.out.println("program is finished");
		}
	}

}



