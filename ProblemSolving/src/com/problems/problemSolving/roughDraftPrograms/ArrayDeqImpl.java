package com.problems.problemSolving.roughDraftPrograms;

import java.util.ArrayDeque;

public class ArrayDeqImpl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayDeque<Integer> ad=new ArrayDeque<Integer>();
		 ad.push(13);
		 ad.push(23);
		 System.out.println(ad.removeLast());
		 ad.push(232);
		 ad.add(24);
		 System.out.println(ad);
		 System.out.println(ad.removeFirst());
		 System.out.println(ad);
		 System.out.println(ad.removeLast());
		 System.out.print(ad.size());
		 MyDeque<Integer> deq=new MyDeque<Integer>();
		 deq.addToHead(4);
		 deq.addToTail(5);
		 deq.addToHead(3);
		 deq.display();
		 System.out.print(deq.removeFirst());
		 System.out.println(deq.removeLast());
		// deq.removeLast();
		deq.display();
	}

}
