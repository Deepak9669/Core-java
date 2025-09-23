package com.rays.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Gmail {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new FileReader("C://IO//Gmail.txt"));

		String line = br.readLine();

		while (line != null) {
			if (line.endsWith("@gmail.com")) {

				System.out.println(line);
				line = br.readLine();
			} else {
				line = br.readLine();

			}
		}
		br.close();

	}
}
