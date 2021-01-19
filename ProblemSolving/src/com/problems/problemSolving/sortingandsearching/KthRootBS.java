package com.problems.problemSolving.sortingandsearching;




public class KthRootBS{
 static int power(int a, int b){
     int temp;
     if(b==0){
         return 1;
     }
     temp=power(a,b/2);
     if(b%2==0)return temp*temp;
     else{
        return a*temp*temp;
     }
 }

static int kthRoot(int start, int end, int N, int K) {
    if (start <= end) {
        int mid = (start + end )/ 2;
        if ((power(mid, K) <= N) && (power(mid, K + 1) > N)) {
            return mid;
        } else if (power(mid, K) < N) {
            return kthRoot(mid +1, end, N, K);

        } else {
            return kthRoot(start, mid-1, N, K);
        }
    }
    return start;
 }


    public static void main(String[] args) {
       // System.out.println(power(3,4));
        int N=16, k=4;
        System.out.println(kthRoot(0,N,N,k));

    }

}
