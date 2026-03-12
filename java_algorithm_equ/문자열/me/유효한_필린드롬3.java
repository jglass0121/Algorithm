package me;

import java.util.Scanner;

public class 유효한_필린드롬3 {
    public static void main(String[] args) {
        // stringbuilder로 해결

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine().toLowerCase();
        str = str.replaceAll("[^a-z]", "");

        StringBuilder sb = new StringBuilder();
        StringBuilder one = sb.append(str).reverse();


        if (str.equals(one.toString())) {
            System.out.println("YES");
        }else{
            System.out.println("NO");

        }
    }
}
