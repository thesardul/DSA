package com.thesardul.array;

import java.util.HashMap;

public class CommonElementsInTwoArray {
    public static void main(String[] args) {
        int[] A = {1, 2, 2, 1, 2}; //< 1, 1> , <2,1>
        int[] B = {2, 3, 1, 2, 6, 6};
        HashMap<Integer, Integer>  hMap = new HashMap<>();

        for(int i  = 0; i < A.length; i++){
            if(hMap.containsKey(A[i])){
                hMap.put(A[i], hMap.get(A[i])+ 1);
            }
            else {
                hMap.put(A[i], 1);
            }
        }
        for(int i = 0; i < B.length; i++){
            if(hMap.containsKey(B[i]) && hMap.get(B[i]) > 0){
                hMap.put(B[i], hMap.get(B[i]) - 1);
                System.out.println(B[i]);
            }
        }

    }
}
