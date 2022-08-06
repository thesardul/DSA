package com.thesardul.array_2d;

public class MatrixSum {
    public static void main(String[] args) {
        int [][] A = {{1,2,3,4},{5,6,7,8},{9,2,3,4}};
        int [][] B = {{1,2,3,4},{5,6,7,8},{9,2,3,4}};
        int [][] res = matrixSum(A,B);
        for(int i = 0; i < A.length; i++){
            for(int j = 0; j < A[i].length; j++){
                System.out.print(res[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static int[][] matrixSum(int[][] a, int [][]b) {
        int rows = a.length;
        int cols = a[0].length;
        int [][] res = new int[rows][cols];
        for(int i = 0; i < rows; i++){
            int sum = 0;
            for(int j = 0; j < cols; j++){
                res[i][j] = a[i][j] + b[i][j];
            }
        }

        return res;
    }
}
