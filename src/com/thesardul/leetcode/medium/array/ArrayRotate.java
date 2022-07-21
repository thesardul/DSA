package com.thesardul.leetcode.medium.array;

import java.util.Arrays;

public class ArrayRotate {
    public static void main(String[] args) {
        int [] nums = {-1,-100,3,99};
        int k = 2;
//        int nums[] = {1,2,3,4,5,6,7};
        System.out.println(Arrays.toString(nums));

        while(k > 0){
            int l = nums.length;
            int temp = nums[l - 1];
            for(int i = l - 1; i > 0; i--){
                nums[i] = nums[i - 1];
            }
            nums[0] = temp;
            k--;
        }

        System.out.println(Arrays.toString(nums));
    }
}
