package com.rays.queue;

import java.util.ArrayDeque;
import java.util.Queue;

public class TestQueue {
	public static void main(String[] args) {
		
		Queue q=new ArrayDeque();
		
		q.offer(6);
		q.offer(5);
		q.offer(4);
		q.offer(3);
		
		System.out.println("Queue :"+ q);
        System.out.println(q.peek());
		System.out.println("Queue :"+ q);
		System.out.println(q.poll());
		System.out.println("Queue :"+ q);
		
		
		System.out.println("__________________");
		
		Queue q2=new ArrayDeque();
		
		for(char c='a'; c<='z';c++) {
			q2.offer(c);
			
		}	
		System.out.println("q2 :"+q2);
		System.out.println("peak :"+q2.peek());
		System.out.println("q2 :"+q2);
		System.out.println("poll :"+q2.poll());
		System.out.println("q2 :"+q2);
		
		while(!q2.isEmpty()) {
			System.out.println(q2.poll());
		}
		System.out.println("q2 :"+q2);
				
				
			
			
		}
	}


