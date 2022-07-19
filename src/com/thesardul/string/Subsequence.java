package com.thesardul.string;

import java.util.ArrayList;

public class Subsequence {
    public static void main(String[] args) {
        int[] arr = {3,1,2};
        ArrayList<Integer> aList = new ArrayList<>();

        printSub(0,aList, arr, arr.length);
    }

    private static void printSub(int ind, ArrayList<Integer> aList, int[] arr, int length) {
        if(ind == length){
            for(Integer i : aList){
                System.out.print(i + " ");
            }
            if(aList.size() == 0)
                System.out.print("{ }");
            System.out.println();
            return;
        }
        printSub(ind + 1, aList, arr, length);
        aList.add(arr[ind]);
        printSub(ind + 1, aList, arr, length);
        aList.remove(aList.size() - 1);
    }
}
