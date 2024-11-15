package me;

import java.util.Scanner;

public class 문자열_압축 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(solution(str));
    }

    private static String solution(String str) {
        int cnt = 1;
        StringBuilder sb = new StringBuilder();
        sb.append(str.charAt(0));
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == str.charAt(i - 1)) {
                cnt++;
            } else {
                if (cnt > 1) {
                    sb.append(cnt);
                    cnt = 1;
                }
                sb.append(str.charAt(i));

            }
        }
        if (cnt > 1) {
            sb.append(cnt);
        }

        return sb.toString();

    }

}
