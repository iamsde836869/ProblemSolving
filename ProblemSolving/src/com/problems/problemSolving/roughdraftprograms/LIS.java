package com.problems.problemSolving.roughdraftprograms;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collections;

public class LIS {
	public static class Pair{
		int l;
		int i;
		int v;
		String psf;
		Pair(int l, int i, int v, String psf){
			this.l=l;
			this.i=i;
			this.v=v;
			this.psf=psf;
		}

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] arr=new Integer[]{10,22,43,33,21,50,41,60,59,3};
		System.out.print(lISM1(arr));

	}
	/**
	 * @param arr
	 * @return
	 */
	static Integer lISM1(Integer[] arr) {
		//Integer[] subSeqCou=new Integer[arr.length];
		int[] dp=new int[arr.length];
		// as the first elements longest increasing subsequence will always measure 1
		int omax=0;	
		for(int i=0;i<arr.length;i++) {
			int max=0;
			for(int j=0;j<i;j++) {
				if(arr[j]<=arr[i] && dp[j]>max) {
					max	=dp[j];
				}
			}
			dp[i]=max+1;
			if(dp[i]>omax) {
				omax=dp[i];
			}
		}	
		ArrayDeque<Pair> data=new ArrayDeque<Pair>();
		for(int i=0;i<dp.length;i++) {
			if(omax==dp[i]) 
				data.add(new Pair(omax, i, arr[i],arr[i]+""));
		}
		
		while(data.size()>0) {
			Pair rem=data.removeFirst();
			
			if(rem.l==1)
				System.out.println(rem.psf);
			
			for(int j=rem.i-1;j>=0;j--) {
				if(dp[j]==rem.l-1 && arr[j]<=rem.v) {
					data.add(new Pair(dp[j], j , arr[j],arr[j]+"-> "+rem.psf));

				}
			}
		}

		return omax;
		//return subSeqCou[subSeqCou.length-1];


		//return 0;
	}

}
