package com.problems.problemSolving.bigoarraysandstrings;

public class dutchNationalFlagAlgo {
    static void dNFA(int a[], int n) {
        int temp, lo = 0, mid = 0, hi = n - 1;
        while (mid <= hi) {
            switch (a[mid]) {
                case 0: {
                    temp = a[lo];
                    a[lo] = a[mid];
                    a[mid] = temp;
                    lo++;
                    mid++;
                    break;
                }
                case 1:
                    mid++;
                    break;
                case 2: {
                    temp = a[mid];
                    a[mid] = a[hi];
                    a[hi] = temp;
                    hi--;
                    break;
                }
            }
        }

        for (int i = 0; i < n; i++)
            System.out.print(a[i] + " ");
        System.out.println("");
    }


    //int n=arr.length;
   // System.out.println();

    public static void main(String[] args)
    {
        int arr[] = { 0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1 };
        int n = arr.length;
        dNFA(arr,n);
        //System.out.println();
    //    printAy(arr,n);
    }
}
