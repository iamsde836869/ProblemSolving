package com.problems.problemSolving.otherProblems;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListImplemen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
	}

}
