package com.rays.exception;

public class TestLoginException {
	
	public static void main(String[] args) throws LoginException {
		
		String LoginId="admin123@gmail.com";
		if(LoginId!=null && LoginId=="admin@gmail.com") {
			System.out.println("userlogin succesfully");
		}else {
			System.out.println("invalid");
			throw new LoginException("invalid");
		}
		System.out.println("entered in application");
	}

}
