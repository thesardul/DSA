package com.thesardul.leetcode.easy.array;

import java.util.Arrays;

public class DuplicateNumber {
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 2, 5,5};
        System.out.println(duplicateNumber(arr));
    }

    private static int duplicateNumber(int[] arr) {
        Arrays.sort(arr);
        for (int i = 0; i < arr.length-1; i++) {
            int j = i+1;
            if( j <= arr.length && arr[i] == arr[j]){
                return arr[i];
            }
        }
        return 0;
    }
}
