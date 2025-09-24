package com.rays.task;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Email {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new FileReader("C://IO//Email.txt"));
		BufferedWriter bw=new BufferedWriter(new FileWriter("C://IO//validEmail.txt"));
		
    String  emailRegex= "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$";

		String email = br.readLine();

		while (email != null) {
			if (email.matches(emailRegex)) {

				System.out.println(email);
				bw.write(email);
				bw.newLine();
							 			
		}
			email=br.readLine();
	}
		br.close();
		bw.close();
		System.out.println("add valid email sucessfully");
	}

}