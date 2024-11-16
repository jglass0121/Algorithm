package me;

import java.util.Scanner;

public class 암호 {
    public static void main(String[] args) {
        // 1. 7자리씩 나누기
        // 2. # -> 1 * ->0 변환
        // 3. 이진수 -> 10진수로 변경  영어로 변환

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.nextLine();
        String str = sc.nextLine();

        String res = "";


        int k = 0;
        for (int i = 0; i < num; i++) {
            String substring = str.substring(k, k + 7);
            k += 7;
            String changeInt ="";
            for (int j = 0; j < substring.length(); j++) {
                if (substring.charAt(j) == '#') {
                    changeInt += "1";
                } else {
                    changeInt += "0";
                }

            }

            int num1 = Integer.parseInt(changeInt,2);
            char character = (char) num1;
            res += character;


        }
        System.out.println(res);

    }
}
