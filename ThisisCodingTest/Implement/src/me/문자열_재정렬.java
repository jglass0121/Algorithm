package me;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.Collectors;

public class 문자열_재정렬 {
    public static void main(String[] args) {
        String s = "K1KA5CB7";

        int sum = 0;
        String alpa = "";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isLetter(c)) {
                alpa += c;
            }else{
                sum += c-'0';
            }
        }


        String[] split = alpa.split("");
        Arrays.sort(split);
        String key = String.join("", split);
        String s1 = key + "" + sum;
        System.out.println(s1);
    }
}
