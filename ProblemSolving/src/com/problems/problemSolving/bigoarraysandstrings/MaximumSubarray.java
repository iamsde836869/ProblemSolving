package com.problems.problemSolving.bigoarraysandstrings;

import java.util.Scanner;

//kadanes algorithm
//0 -1 -3 -4 5 4 -2
//O(n) initial count, if we see the initial+consecutive count to be negative then initialize count to zero (sue 2 variables to keep a check )
public class MaximumSubarray {
    public static void main(String args[]){
       Scanner in=new Scanner(System.in);
       System.out.println("Enter the size of the array:");
       int n=in.nextInt();
        int count=0;
       int[] arr=new int[n];
        for (int indexarr=0;indexarr < n;indexarr++) {
            arr[indexarr]=in.nextInt();
        }
        int maxi=arr[0];
        for (int i=0;i < n;i++) {count+=arr[i];
                if(count>maxi){
                    maxi=count;
                }
                if(count<0){
                    count=0;
                }

        }
    System.out.println("\n the max sub array is:" + count);
    }
}
