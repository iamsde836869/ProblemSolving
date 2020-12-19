package com.problems.problemSolving.hashmapDictionaryHashSet;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;

public class ModeFreq {
    public static void main(String args[]) throws  Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            int t=Integer.parseInt(br.readLine());
            //t is the number of test cases
        while (t-->0){
            int n=Integer.parseInt(br.readLine());
                // n is the number of the elements in the array
            int[] arr=new int[n];
            String[] st=br.readLine().split(" ");
            for (int i=0;i<n;i++){
                arr[i]=Integer.parseInt(st[i]);

            }
            /*for (int i=0;i<n;i++){
                //arr[i]=Integer.parseInt(st[i]);
                System.out.println(arr[i]);
            }*/
            HashMap<Integer,Integer>freqMap=new HashMap<>();
            for(int val:arr){
                freqMap.put(val,freqMap.getOrDefault(val,0)+1);
               // System.out.println(freqMap);
            }
            HashMap<Integer,Integer>modal=new HashMap<>();
            for(int val:freqMap.keySet()){
                modal.put(freqMap.get(val),modal.getOrDefault(freqMap.get(val),0)+1);
            }
                 //          System.out.println(modal);
            int ele=Integer.MAX_VALUE;
            int maxFreq=0;
            for(int val:modal.keySet()){
                int count=modal.get(val);//val is the
                if(count>maxFreq){
                    maxFreq=count;
                    ele=val;
                }
                else if(count==maxFreq && val<ele){
                    ele=val;

                }
            }
            System.out.println(ele);
        }
    }
}
