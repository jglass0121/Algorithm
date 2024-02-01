package String;

import java.util.Arrays;

public class ReverseString {
    public static void main(String[] args) {
        String[] s = {"H","a","n","n","a","h"};
        solution(s);
    }

    private static void solution(String[] s) {
        int rot = s.length / 2;
        for (int i = 0; i < rot; i++) {
            String start = s[i];
            String end = s[s.length - 1 - i];
            swap(s,i, start, end);
        }

        System.out.println(Arrays.toString(s));

    }

    private static void swap(String[] s, int i, String start, String end) {
        s[s.length - 1 - i] = start;
        s[i] = end;
    }
}
