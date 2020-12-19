/**
 * 
 */
package com.problems.problemSolving.recursionAndDynamicProgramming;

import java.util.*;
import java.io.*;

/**
 * @author code2
 *
 */

/*
8
1   
5   
8   
9  
10 
17  
17  
20*/
public class RodCuttingProblem {

	
	public static int solution(int[] prices) {
		 int[] dp = new int[prices.length + 1];
	        for(int i = 1; i < dp.length; i++){
	            int max = Integer.MIN_VALUE;
	            for(int j = 0; j < i; j++){
	                max = Math.max(max, dp[i - j - 1] + prices[j]);
	                System.out.println("max" + "= Math.max(max :" + max +  ",dp[i - j - 1] : " + dp[i - j - 1] + " and  prices[j] :" + prices[j] + ") " );
	            }
	            System.out.println();
	            dp[i] = max;
	        }
	       // System.out.println(dp[1-1-1] + "*********");
	        
	        return dp[dp.length - 1];
		
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner scn=new Scanner(System.in);
			int n=scn.nextInt();
			int[] price = new int[n];
			for(int i=0;i<n;i++) {
				price[i]=scn.nextInt();
			}
			System.out.print(solution(price));
			
	}

}
