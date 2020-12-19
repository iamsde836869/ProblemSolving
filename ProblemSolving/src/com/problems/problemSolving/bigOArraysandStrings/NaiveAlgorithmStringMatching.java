package com.problems.problemSolving.bigOArraysandStrings;

    // Java program for Naive Pattern Searching
public class NaiveAlgorithmStringMatching {

    public static void search(String S, String P)
    {
        int M = P.length();
        int N = S.length();

        /* A loop to slide pat one by one */
        for (int i = 0; i <= N - M; i++) {

            int j;

			/* For current index i, check for pattern
			match */
            for (j = 0; j < M; j++)
                if (S.charAt(i + j) != P.charAt(j))
                    break;

            if (j == M) // if pat[0...M-1] = txt[i, i+1, ...i+M-1]
                System.out.println("Pattern found at index " + i);
        }
    }

    public static void main(String[] args)
    {
        String S = "ababbab";
        String P = "ababb";
        search(S, P);
    }
}

