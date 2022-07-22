package com.thesardul.leetcode.easy.string;

import java.util.Arrays;

public class ReverseString {
    public static void main(String[] args) {
        char[] s = {'h','e','l','l','o','w'};
        reverseString(s);

    }

    private static void reverseString(char[] s) {
        int len = s.length;
        int lo = 0, hi = len - 1;

        while( lo <= hi){
            char temp = s[lo];
            s[lo] = s[hi];
            s[hi] = temp;
            hi--;
            lo++;
        }

        System.out.println(Arrays.toString(s));
    }
}
