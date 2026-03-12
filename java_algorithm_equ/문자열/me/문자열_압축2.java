package me;

import java.util.Scanner;

public class 문자열_압축2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int cnt = 1;
        char prev =str.charAt(0);
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < str.length(); i++) {

            char now = str.charAt(i);
            if (prev == now) {
                cnt++;
            }else{
                if (cnt == 1) {
                    sb.append(prev);
                }else{
                    sb.append(prev).append(cnt);
                }
                prev = now;
                cnt = 1;
            }

        }

        if (cnt == 1) {
            sb.append(prev);
        }else{
            sb.append(prev).append(cnt);
        }
        System.out.println(sb.toString());
    }
}
