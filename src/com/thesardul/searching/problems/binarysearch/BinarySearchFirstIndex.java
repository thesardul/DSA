package com.thesardul.searching.problems.binarysearch;

public class BinarySearchFirstIndex {
    public static void main(String[] args) {
        int arr[] = {5,10,10,15,20,20,20};
        System.out.println("Found at index " + binarySearchRec(arr,0,arr.length-1,20));
        System.out.println("Found at index " + binarySearchIt(arr,0,arr.length-1,15));
    }

    private static int binarySearchIt(int[] arr, int l, int r, int x) {
        return -1;
    }

    private static int binarySearchRec(int[] a, int l, int r, int x) {
        if(l > r) return -1;
        if(r >= l) {
            int m = l + (r - l) / 2;
            if (a[m] < x)
                return binarySearchRec(a, m + 1, r, x);
            else if (a[m] > x)
                return binarySearchRec(a, l, m - 1, x);
            else {
                if (m == 0 || a[m - 1] != a[m]) {
                    return m;
                } else
                    return binarySearchRec(a, l, m - 1, x);
            }
        }
        return -1;
    }
}
