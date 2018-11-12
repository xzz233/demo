package com.example.demo.solution;

import java.util.Arrays;

public class Solution {
    public static int solve(int[] a) {
        int len=a.length;

        //Not enough elements
        if(len<3) return -1;

        //Remove negative numbers
        a = Arrays.stream(a).filter(m -> m > 0).toArray();

        Arrays.sort(a);

        for (int i = a.length - 1 ; i >1; i--) {
            if (a[i - 2] + a[i - 1] > a[i]) {
                return a[i] + a[i - 1] + a[i - 2];
            }
        }
        return -1;
    }
}
