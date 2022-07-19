package com.thesardul.string;

import java.util.ArrayList;

public class MinimumDistanceInSequence {
    public static void main(String[] args) {
        int minDis = Integer.MAX_VALUE;
        String A = "x..o.x..0";
        ArrayList<Integer> list_o = new ArrayList<>();
        ArrayList<Integer> list_x = new ArrayList<>();

        for(int i = 0; i < A.length(); i++){
            if(A.charAt(i) == 'o')
                list_o.add(i);
            else if(A.charAt(i) == 'x')
                list_x.add(i);
        }

        for(int i = 0; i < list_o.size(); i++){
            for(int j = 0; j < list_x.size(); j++){
                int temp = Math.abs(list_o.get(i) - list_x.get(j));
                minDis = Math.min(minDis, temp);
            }
        }
        System.out.println(minDis == Integer.MAX_VALUE ? - 1 : minDis);
    }

    private static int foo(int x, int y) {
        if(y == 0) return 1;
        return bar(x, foo(x, y - 1));
    }

    private static int bar(int x, int y) {
        if(y == 0) return 0;
        return (x + bar(x, y - 1));
    }
}
