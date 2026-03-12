package me;

import java.util.Scanner;

public class 암호1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.nextLine();
        String str = sc.nextLine();


        String res = "";
        int start =0;
        for (int i = 1; i <= num; i++) {
            String strSub = str.substring(start, start + 7);
            start = start+7;


            // 계산
            String s = "";
            for (int j = 0; j < strSub.length(); j++) {
                char c = strSub.charAt(j);
                if (c == '#') {
                    s += "1";
                }else{
                    s += "0";
                }

            }
            char a = (char) Integer.parseInt(s, 2);
            res += "" + a;


        }

        System.out.println(res);

    }
}
