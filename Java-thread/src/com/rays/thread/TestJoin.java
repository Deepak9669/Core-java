package com.rays.thread;

public class TestJoin {
	
	public static void main(String[] args) {
		
		Join j1 = new Join("devil");
		Join j2 = new Join("shiva");
		
		j1.start();//only start j1 thread
		
		try {
			j1.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		j2.start();//then start j2 thread
	}

}
