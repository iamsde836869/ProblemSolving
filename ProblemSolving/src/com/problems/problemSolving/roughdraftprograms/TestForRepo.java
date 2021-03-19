/**
 * 
 */
package com.problems.problemSolving.roughdraftprograms;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.util.Collections;
import java.util.Scanner;

/**
 * @author code2
 *
 */
public class TestForRepo {
	static private void swap(int x, int y) {
	      x = x + y;
	        y = x - y;
	        x = x - y;
	}	
	
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
	public static void main(String[] args) {
		int Array[]= {3,4,1,-1};
		//System.out.println("FMP(Array) returns :" + FMP(Array));
		System.out.println("firstMissingPositive(Array) returns :" + firstMissingPositive(Array));
	
		}
	}


