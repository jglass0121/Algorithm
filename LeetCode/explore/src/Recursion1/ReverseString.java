package Recursion1;

import java.util.Arrays;

public class ReverseString {
    public static void main(String[] args) {
        char[] s = {'h', 'e', 'l', 'l', 'o'};
        solution(s);
        System.out.println("Arrays.toString(s) = " + Arrays.toString(s));
    }

    private static void solution(char[] s) {
        fac(s, 0,s.length-1);
    }

    private static void fac(char[] s, int start,int end) {
        if(start>=end) return;
        //swap
        char temp = s[end]; // 마지막
        s[end] = s[start]; // 첫번째
        s[start] = temp;
        System.out.println("end = " + end);

        fac(s, start + 1, end-1);



    }
}
