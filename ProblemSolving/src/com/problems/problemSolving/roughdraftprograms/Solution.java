package com.problems.problemSolving.roughdraftprograms;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        /* Read input */
        Scanner scan = new Scanner(System.in);
        int i    = scan.nextInt();
        double d = scan.nextDouble();
        //System.out.println("\n");
        scan.nextLine();              // gets rid of the pesky newline  
        String s = scan.nextLine();
        scan.close();
        
        /* Print output */
        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}
/* output with       scan.nextLine();  
42
3.1415
Welcome to HackerRank's Java tutorials!
String: Welcome to HackerRank's Java tutorials!
Double: 3.1415
Int: 42
 */