package com.thesardul.leetcode.easy.bitManipulation;

public class SingleNumber {
    public static void main(String[] args) {
        int[] arr = {1,2,2,1,3};
        System.out.println(singleNumber(arr));
    }

    private static int singleNumber(int[] a){
        int result = 0;
        if(a.length % 2 == 0)
            return 0;
        for (int i = 0; i < a.length; i++) {
            result ^= a[i];
        }

        return result;
    }
}
