package com.problems.problemSolving.roughdraftprograms;

import java.util.Scanner;

public class MergeSort{
    
    static void merge(int[] arr, int low,int mid, int high) {
        int leftoarr=mid-low+1;
        int rightoarr=high-mid;
        int[] temparr1=new int[leftoarr];
        int[] temparr2=new int[rightoarr];
        for(int i=0;i<leftoarr;i++) temparr1[i]=arr[low+i];
        for(int j=0;j<rightoarr;j++) temparr2[j]=arr[mid+1+j];
        int i=0;
        int j=0;
        int k=low;
        while(i<leftoarr && j<rightoarr) {
            if(temparr1[i]<temparr2[j]) {
                arr[k++]=temparr1[i++];
            }
            else {
                arr[k++]=temparr2[j++];
            }
        }
        while(i<leftoarr)arr[k++]=temparr1[i++];
        while(j<rightoarr)arr[k++]=temparr2[j++];
    }
    static void mergeSort(int[] arr,int low,int high) {
        if(low<high) {
        int mid=(low+high)/2;
        mergeSort(arr,low,mid);
        mergeSort(arr,mid+1,high);
        merge(arr,low,mid,high);
        }
    }
    
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        int soArr=sc.nextInt();
        int[] arr=new int[soArr];
        for(int i=0;i<soArr;i++) {
            arr[i]=sc.nextInt();
        }
        int low=0;
        int high=arr.length;
        mergeSort(arr,low,high-1);
         System.out.print("[");
        for(int i=0;i<soArr;i++) {
            System.out.print(arr[i]);
            if(i!=soArr-1)System.out.print(",");
        }
        System.out.print("]");
        System.out.println();
        
        
    }

}
