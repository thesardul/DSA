package com.thesardul.array_2d;

public class ColSum {
    public static void main(String[] args) {
        int [][] A = {{1,2,3,4},{5,6,7,8},{9,2,3,4}};
        int [] res = colSum(A);
        for(int i : res)
            System.out.print(i + " - ");
    }

    private static int[] colSum(int[][] a) {
        int[] res = new int[a[0].length];
        int rows = a.length;
        int cols = a[0].length;
        for(int i = 0; i < cols; i++){
            int sum = 0;
            for(int j = 0; j < rows; j++){
                sum += a[j][i];
            }
            res[i] = sum;
        }
        return res;
    }
}
