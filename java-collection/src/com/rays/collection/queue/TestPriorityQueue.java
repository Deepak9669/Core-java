package com.rays.queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class TestPriorityQueue {
	
	public static void main(String[] args) {
		 
		Queue q = new PriorityQueue();
		
		q.offer(1);
		q.offer(2);
		q.offer(3);
		q.offer(4);
     	q.offer(5);
		q.offer(6);
		q.offer("deepak");
		
		
		System.out.println("q :"+q);
		System.out.println("peak :"+q.peek());
		System.out.println("q :"+q);
		System.out.println("poll :"+q.poll());
		System.out.println("q :"+q);


	}

}
