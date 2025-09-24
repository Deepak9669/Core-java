package com.rays.task;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class PhoneRegex {
	

		public static void main(String[] args) throws IOException {

			BufferedReader br = new BufferedReader(new FileReader("C://IO//phone.txt"));
			BufferedWriter bw=new BufferedWriter(new FileWriter("C://IO//valiPhone.txt"));
			
	    String  phoneRegex=  "^(?:\\+91|0)?[6-9]\\d{9}$";

	    		

			String phone = br.readLine();

			while (phone != null) {
				if (phone.matches(phoneRegex)) {

					System.out.println(phone);
					bw.write(phone);
					bw.newLine();
								 			
			}
				phone=br.readLine();
		}
			br.close();
			bw.close();
			System.out.println("add valid phone sucessfully");
		}

	}


