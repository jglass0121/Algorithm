package me;

import java.util.Scanner;

public class 가장짧은_문자거리3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] arr = str.split(" ");

        String origin = arr[0];
        String findChar = arr[1];


        // 계산
        int prev = -1;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < origin.length(); i++) {
            char c = origin.charAt(i);
            int now = i;
            int nextChar = origin.indexOf(findChar, i);

            if (c == findChar.charAt(0)) {
                sb.append(0).append(" ");
                prev = i;
                continue;
            }

            if (prev == -1) {
                int nextDiff = nextChar - now;
                sb.append(nextDiff).append(" ");
                continue;
            }

            int prevDiff = Math.abs(now - prev);
            int nextDiff = nextChar == -1 ? Integer.MAX_VALUE : Math.abs(nextChar - now);

            int min = Math.min(prevDiff, nextDiff);
            sb.append(min).append(" ");


        }

        System.out.println(sb.toString().trim());


    }
}
