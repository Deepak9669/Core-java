package com.rays.task;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;



public class SplitFile {
	public static void main(String[] args) throws IOException {
		
		String s="C://IO//merge.txt";
		
		int count=0;
		int nol=2;
		
		File file = new File(s);
		Scanner sc = new Scanner(file);
		
		while(sc.hasNext()) {
			sc.nextLine();
			count++;
		}
		System.out.println("no of lines :"+count++);
		
		int tem=count/nol;
		int rem= count%nol;
		int nof=0;
		
		if(tem!= 0) {
			nof=tem;
			if(rem!=0) {
				nof++;
			}else {
				nof=tem;
			}
		}
		System.out.println("no of file :"+nof);
		
		
		BufferedReader br= new BufferedReader(new FileReader(s));
		
		String str;
		
		for(int i=1;i<=nof;i++) {
			
			BufferedWriter bw= new BufferedWriter(new FileWriter("C://IO//afterSplit"+i+".txt"));
			
			str = br.readLine();
			
			for(int j=1;j<=nol;j++) {
				if(str!=null) {
					bw.write(str);

					
					if (j != nol) {

						bw.newLine();
						str = br.readLine();

				}
					
			}
				
		}
    bw.close();
		
	
	}
		br.close();
	}
}
