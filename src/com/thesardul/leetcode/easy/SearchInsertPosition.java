package com.thesardul.leetcode.easy;

public class SearchInsertPosition {
    public static void main(String[] args) {
        int[] a = {4,5,7,10,12,16,20};
        System.out.println(getInsertPosition(a,0,a.length - 1, 11));
    }

    private static int getInsertPosition(int[] a, int l, int r, int x) {
        while(l <= r){
            int m = l + (r - l) / 2;
            if(a[m] == x) return m;
            else if (a[m] > x) r = m - 1;
            else l = m + 1;
        }
        return l;
    }
}
