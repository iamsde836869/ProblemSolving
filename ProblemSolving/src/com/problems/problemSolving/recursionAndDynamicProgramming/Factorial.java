package com.problems.problemSolving.recursionAndDynamicProgramming;

import java.util.ArrayList;
import java.util.List;

public class Factorial {

    public List<Integer> memoizeCache = new ArrayList<>();

    public Integer calculate(Integer input) {

        if (input == 0) {
        	//System.out.println("memoizeCache.size() : " + memoizeCache.size() + " input : " + input );

            return 1;
        } else {
            if (memoizeCache.size() >= input) {
                System.out.println("Retrieved from cache: " + input + "memoizeCache.get(input - 1) =======" + memoizeCache.get(input - 1));
                return memoizeCache.get(input - 1);
            }
            System.out.println("Calculate for input:" + input);
            int factorial = input * calculate(input - 1);
            memoizeCache.add(factorial);
            return factorial;
        }
    }

    public List<Integer> getMemoizeCache() {
        return memoizeCache;
    }
}
