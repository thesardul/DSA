package com.thesardul.searching.algorithms;

//import static java.util.Arrays.binarySearch;

public class BinarySearch {
    public static void main(String[] args) {
        int arr[]  = {2,5,8,12,16,23,38,56,72,92};
//        System.out.println("Found at index " + binarySearchIt(arr,0,arr.length-1,23));
        System.out.println("Found at index " + binarySearchRec(arr,0,arr.length-1,23));
    }

    private static int binarySearchRec(int[] arr, int l, int r, int x) {
        if(r >= l){
            int mid = l + (r - l) / 2;
            if(arr[mid] == x)
                return mid;
            if(arr[mid] < x)
                return binarySearchRec(arr, mid + 1, r, x);
            return binarySearchRec(arr, l, mid - 1, x);
        }
        return -1;
    }

    private static int binarySearchIt(int[] arr, int l, int r, int x) {
        while(l <=  r){
            int mid = l + (r - l) / 2;
            if(arr[mid] == x) return mid;

            if(arr[mid] < x) l = mid + 1;

            else r = mid - 1;

        }
        return -1;
    }
}
