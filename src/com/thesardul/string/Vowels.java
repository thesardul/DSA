package com.thesardul.string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Vowels {
    public static void main(String[] args) {
        String str = "interviewbit";
        System.out.println(getVowels(str));

        for(int i = 1; i <101; i+=1){
            System.out.print(i + " ");
        }
    }

    private static String getVowels(String A) {
        String vowels = "aeiou";
        String res = "";

        for(int i = 0; i < A.length(); i++){
            String temp = String.valueOf(A.charAt(i));
            if(vowels.contains(temp)){
                res += A.charAt(i);
            }
        }
        return res;
    }
}
