package com.problems.problemSolving.roughdraftprograms;

import java.util.Arrays;
import java.util.Scanner;

public class SieveOfEratostehnes {

	static public int countPrimes(int n) {
		if(n<=1){
			return 0;
		}

		boolean[] check=new boolean[n+1];
		Arrays.fill(check, true);
		check[0]=false;
		check[1]=false;
		//check[2]=false;
		for(int i=2;i*i<=n;i++){
			for(int j=i*2;j<=n;j+=i){
				check[j]=false;
			}
		}
		int count=0;
		for(int i=1;i<n;i++){
			if(check[i]==true){
				count++;
				System.out.println(check[i] + " number" + i);
			}
		}

		return count;

	}

	public static void main(String args[]) {
		//Scanner in=new Scanner(System.in);

		System.out.println(countPrimes(2));




	}
}
