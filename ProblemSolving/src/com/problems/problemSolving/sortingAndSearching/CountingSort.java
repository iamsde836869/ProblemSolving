package com.problems.problemSolving.sortingAndSearching;

// Counting sort which takes negative numbers as well
import java.util.*;

class CountingSort
{

    static void countSort(int[] arr)//arr 1,3,6,9,12,15,18,21,24,27
    {
        int max = Arrays.stream(arr).max().getAsInt();//27
        System.out.println("max is:" + max);
        int min = Arrays.stream(arr).min().getAsInt();//1
        System.out.println("min is:" + min);
        int range = max - min + 1;//27-1+1=27
        System.out.println("range is:" +range);
        int count[] = new int[range];//array of range 27
        for(int i=0;i<count.length;i++){System.out.print(count[i]);}//total possible elements form 0 to 27
        int output[] = new int[arr.length];//acrtual array
        System.out.println("\n");
        for(int i=0;i<output.length;i++){System.out.print(output[i]);}
        System.out.println("\n");
        for (int i = 0; i < arr.length; i++)
        {
            System.out.print(count[arr[i] - min]++  + " ");
            System.out.println(arr[i] - min);
        }

        for (int i = 1; i < count.length; i++)
        {
            count[i] += count[i - 1];
        }

        for (int i = arr.length - 1; i >= 0; i--)
        {
            output[count[arr[i] - min] - 1] = arr[i];
            count[arr[i] - min]--;
        }

        for (int i = 0; i < arr.length; i++)
        {
            arr[i] = output[i];
        }
    }

    static void printArray(int[] arr)
    {
        for (int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
    }

    // Driver code
    public static void main(String[] args)
    {
        int[] arr = {1,3,6,9,12,15,18,21,24,27};
        countSort(arr);
        printArray(arr);
    }
}

// This code is contributed by princiRaj1992
