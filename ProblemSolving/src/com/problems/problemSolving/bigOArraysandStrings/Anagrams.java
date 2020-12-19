package com.problems.problemSolving.bigOArraysandStrings;

//naive approach O(n^2)
public class Anagrams {
    public static void main(String[] args) {
        String s1 = "##aaa##b";
        String s2 = "abaa####";
        int al[]=new int[256];
        //int bl[]=new int[256];
        boolean visited[] = new boolean[s2.length()];
        boolean isAnagram = true;
        for (char c:
             s2.toCharArray()) {
            int index=(int) c;
            al[index]++;
        }
        for (char c:
                s1.toCharArray()) {
            int index=(int) c;
            al[index]--;
        }

        for (int i=0;i<256;i++){
            if(al[i]!=0){
             isAnagram=false;
            }
        }
        if(isAnagram){
            System.out.println("Ana");
        }
        else {
            System.out.println(" No Ana");
        }
       /* if (s1.length() != s2.length()) {
            System.out.println("Not ana agram");
        } else {
            for (int i = 0; i < s1.length(); i++) {
                isAnagram = false;
                char c = s1.charAt(i);
                for (int j = 0; j < s2.length(); j++) {
                    if (s2.charAt(j) == c && visited[j] == false) {
                        visited[j] = true;
                        System.out.print(c);
                        System.out.print(s2.charAt(j) + "\n");
                        isAnagram = true;

                        break;
                    }
                }
            }

            if (isAnagram) {
                System.out.println("The srting is anagram");
            } else {
                System.out.println("Not anagram");
            }
        }*/
    }
}
