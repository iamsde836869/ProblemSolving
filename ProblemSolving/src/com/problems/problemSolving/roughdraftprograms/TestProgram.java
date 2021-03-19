package com.problems.problemSolving.roughdraftprograms;

//A Java program to demonstrate that assigning Objects[] 
//to Integer[] causes error. 
import java.io.*; 
import java.util.List; 
import java.util.ArrayList; 

class TestProgram { 
	public static void main(String[] args) 
	{ 
		ArrayList<ArrayList<Integer>> al = new ArrayList<ArrayList<Integer>>(); 
		al.get(0).add(0,10); 
		al.get(0).add(1,20); 
		al.get(0).add(2,30); 
		al.get(1).add(1,40); 

		// Error: incompatible types: Object[] 
		// cannot be converted to Integer[] 
		//Integer[] arr = new Integer[al.size()][al.get(0).size]; 
	//	arr = al.toArray(arr); 

		//for (Integer x : arr) 
			//System.out.print(x + " "); 
	} 
} 

