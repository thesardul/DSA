package com.thesardul.array_2d;

public class Transpose {
    public static void main(String[] args) {
        int [][] A = {{1,2,3,4},{5,6,7,8},{9,2,3,4}};
        int [][] res = transpose(A);
        for(int i = 0; i < A.length; i++){
            for(int j = 0; j < A[i].length; j++){

            }
        }
    }

    private static int[][] transpose(int[][] a) {
        int rows = a.length;
        int cols = a[0].length;
        int [][] res = new int[cols][rows];


        return res;
    }
}
