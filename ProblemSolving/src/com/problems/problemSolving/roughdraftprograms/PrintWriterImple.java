package com.problems.problemSolving.roughdraftprograms;

import java.io.PrintWriter;

public class PrintWriterImple {
	//static final StdIn in=new StdIn();
 static final PrintWriter out=new PrintWriter(System.out);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//for(int _=0;_<10;_++) {
			
		//}
		out.print("Print using PrintWriter");

	}

}
/*import java.io.*;
import java.util.*;


public class TestClass {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter wr = new PrintWriter(System.out);
        int T = Integer.parseInt(br.readLine().trim());
        for(int t_i = 0; t_i < T; t_i++)
        {
            int N = Integer.parseInt(br.readLine().trim());
            String[] arr_A = br.readLine().split(" ");
            long[] A = new long[N];
            for(int i_A = 0; i_A < arr_A.length; i_A++)
            {
            	A[i_A] = Long.parseLong(arr_A[i_A]);
            }
            int K = Integer.parseInt(br.readLine().trim());

            int out_ = Solve(N, A, K);
            System.out.println(out_);
            
         }

         wr.close();
         br.close();
    }

    static long countDivisor(long n){
        long root_n=(int)(Math.sqrt(n));
        if(root_n*root_n==n) return 1;//odd
        else return 0;
    } 
    static int Solve(int N, long[] A, int K){
       // Write your code here
       long val=0;
       //long[] B=new long[A.length]; 
       for(int i=0;i<A.length;i++){
               val=countDivisor(A[i]);
                if(val!=1)    A[i]=val;
                
        }
        int count=0;
        long sameBefore=A[0];
        for(int  i=0;i<A.length;i++){
            if(A[i]!=0){
                if(sameBefore!=A[i]) val=A[i];  
                else  count++;
                sameBefore=A[i];
                }
        }
        if(count>0) return count;
        else return -1;

    
    }
}*/
