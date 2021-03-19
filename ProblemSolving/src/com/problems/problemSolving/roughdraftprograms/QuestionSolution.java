package com.problems.problemSolving.roughdraftprograms;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class QuestionSolution {


	public static ArrayList func2(Integer arr[]) 
	{ 
		// Using Arrays.asList() method 
		ArrayList<Integer> array_list = 
			new ArrayList<Integer>(Arrays.asList(arr)); 
	return array_list;
	} 
	
	
	
	public static void backtrack(ArrayList<Integer> nums,
			int start,
			ArrayList<Integer> curr_set,Integer Qarr)//first teh start is 0
	{
		if(!curr_set.isEmpty()) {
			System.out.print(curr_set + " ");
		}
// coude to manipulate the array here
		for(int i = start; i < nums.size(); i++)
		{
			if (i > start && 
					nums.get(i) == nums.get(i - 1))
			{
				continue;
			}
			curr_set.add(nums.get(i));
			backtrack(nums, i + 1, curr_set,Qarr);
			curr_set.remove(curr_set.size() - 1);
		}
	}
	public static void AllSubsets(ArrayList<Integer> nums, Integer Qarr)
	{
		ArrayList<Integer> curr_set = new ArrayList<>();
		Collections.sort(nums);
		backtrack(nums, 0, curr_set,Qarr);
	}


	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Integer noe = in.nextInt(); // number of elements
		Integer[] arr=new Integer[noe];
		for(int i=0;i<noe;i++) {
			arr[i] = in.nextInt();//inputting the number of elements
		}
		Integer Q;
		Q = in.nextInt();//input Q
		Integer Qarr[]=new Integer[Q];
		for(Integer i=0;i<Q;i++) {
			Qarr[i] = in.nextInt();//inputting the Q number of elements
		}
		func2(arr) ; 

		
		for(Integer i=0;i<Q;i++) {
			//Qarr[i]th element
			//Integer intObj = new Integer(Qarr[i]);
			Integer Qarri=Integer.valueOf(Qarr[i]);
			AllSubsets(func2(arr),Qarri);
			System.out.println();//for a newline

		}



	}

}