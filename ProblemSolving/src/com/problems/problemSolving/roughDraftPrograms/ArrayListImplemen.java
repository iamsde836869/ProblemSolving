package com.problems.problemSolving.roughDraftPrograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ArrayListImplemen {
	
	static long timediff(List<Integer> list) {
		long startt=	System.currentTimeMillis();
		for(int i=0;i<10000000;i++) {
			list.add(i);
		}
		long endd=System.currentTimeMillis();
			return (endd-startt);
	}

	public static void main(String[] args) {
		/*// TODO Auto-generated method stub
		 ArrayList<Integer> myNumbers = new ArrayList<Integer>();
		    myNumbers.add(10);
		    myNumbers.add(15);
		    myNumbers.add(20);
		    myNumbers.add(25);
		    myNumbers.set(2, 1020);
		    for (int i : myNumbers) {
		      System.out.println(i);	
		    }
		    Collections.sort(myNumbers);
		    
		    Iterator<Integer> it = myNumbers.iterator();

		    // Print the first item
		    while(it.hasNext()) {
		    	  System.out.println(it.next());
		    	}
		    System.out.println(myNumbers.size());
	*/
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(100);
		al.add(300);
		al.add(200);
		Collections.sort(al);
	Iterator<Integer> it=al.iterator();
	while(it.hasNext()) {System.out.print(it.next() + " ");};
	ArrayList<Object> al1=new ArrayList<>();
	al1.add("jay can absolutely do all things");
	al1.add(100);
	al1.add(10.21);
	al1.add(1000000000);
	Iterator it1=al1.iterator();
	while(it1.hasNext()) {
		System.out.println(it1.next());
	}
	Integer a = 23434;
	String b ="Jay can do all things";
	Pair<Integer, String> p1 = new Pair(a,b);
 p1.display();
 	LinkedList<Integer> ll=new LinkedList<Integer>();
 	ll.add(10);
 	List<Integer> a1=new ArrayList<Integer>();
 	//Object abc=Float.MAX_VALUE  ;
 	//Object abc="Jay dont live mediocre";
 	
    System.out.println("\n" + timediff(ll));
    System.out.println("\n" + timediff(al));
 	//System.out.print("\n" + abc.getClass() + abc);
	
	}

}
