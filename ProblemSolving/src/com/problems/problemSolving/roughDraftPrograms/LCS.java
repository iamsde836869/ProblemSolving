package com.problems.problemSolving.roughDraftPrograms;

//import java.util.ArrayList;

public class LCS {
	static int reclcs(int i, int j, String s1, String s2, int[][] lcsdp) {
	
		if(i>=s1.length()||j>=s2.length()) {
			return 0;
		}
		if(lcsdp[i][j]!=-1) {
			return lcsdp[i][j]; 
		}
		if(s1.toCharArray()[i]==s2.toCharArray()[j]) {
			System.out.print(s1.toCharArray()[i]);
			return 1 + reclcs(i+1,j+1,s1,s2,lcsdp);
		}
		else {
			int left=reclcs(i+1,j,s1,s2,lcsdp);
			int right=reclcs(i,j+1,s1,s2,lcsdp);
				 return lcsdp[i][j]=Math.max(left,right);
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1= "abcde",s2= "aefadfad";
		int a=s1.toCharArray().length;
		int b=s2.toCharArray().length;
		int[][] lcsdp = new int[a][b];
		for (int i = 0; i < a; i++)
			  for (int j = 0; j < b; j++)
			    lcsdp[i][j] = -1;
	
		System.out.print(reclcs(0,0,s1,s2,lcsdp));
		
	}

}
