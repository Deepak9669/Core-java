package com.rays.thread;

public class TestThreadRunable {
	
	public static void main(String[] args) {
		
		Thread t1=new Thread(new ThreadRunable("Deepak"));
		Thread t2=new Thread(new ThreadRunable("Verma"));
		
		t1.start();
		t2.start();
		
	}

}
