package com.problems.problemSolving.roughdraftprograms;

import java.util.ArrayList;
import java.util.List;




public class FindMissingPositive {
	
	
	static public int firstMissingPositive(int[] A)
	{
	    int n = A.length;
	    for(int i = 0; i < n; ++ i) {
	        while(A[i] >= 1 && A[i] <= n && A[i] != A[A[i]-1])
	            swap(A[i], A[A[i] - 1]);
	    }
	    
	    for(int i = 0; i < n; ++ i)
	        if(A[i] != i + 1)
	            return i + 1;
	    
	    return n + 1;
	}
	
	
	static public int FMP(int[] nums) {
		for(int itr=0;itr<nums.length;itr++) {
			if(nums[itr]>0 && nums[itr]<=nums.length && nums[itr]!=nums[nums[itr]-1]) {
				 swap(nums[itr],nums[nums[itr]-1]);
			}
		}
		for(int itr=0;itr<nums.length;itr++) if(nums[itr]!=itr+1)  return itr+1;
		return nums.length+1;
	}
static private void swap(int value, int valueOfValue) {
    value = value + valueOfValue;
    valueOfValue = value - valueOfValue;
    value = value - valueOfValue;
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int Array[]= {3,4,-1,1};
		//System.out.println("FMP(Array) returns :" + FMP(Array));
		System.out.print("firstMissingPositive(Array) returns :" + firstMissingPositive(Array));
	}

}
