package me;

import java.util.Scanner;

public class 교육과정_설계 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String must = sc.nextLine();
        String str = sc.nextLine();
        char[] arr = str.toCharArray();

        String res = "";
        for (int i = 0; i < arr.length; i++) {
            char s = arr[i];
            int idx = must.indexOf("" + s);
            if(idx != -1){
                res += "" + s;
            }
        }


        if (must.equals(res)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }


    }
}
