package _4장;

import java.util.Scanner;

public class 문자열_내p와y의_개수 {
    public static void main(String[] args) {
        String s = "Pyy";
        System.out.println(solution(s));
    }

    private static boolean solution(String s) {
        s = s.toLowerCase();
        int p = 0;
        int y = 0;
        for (int i = 0; i < s.length(); i++) {
            char at = s.charAt(i);
            if (at == 'p') {
                p++;
            } else if (at == 'y') {
                y++;
            }
        }

        if (p == y) {
            return true;

        } else {
            return false;

        }

    }
}
