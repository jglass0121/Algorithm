package me;

import java.util.Scanner;

public class 유효한_팰린드롬2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine().toLowerCase();
        solution(str);

    }

    private static void solution(String str) {
        String str1 = str.replaceAll(" ", "");
        String str2 = str.replaceAll("[^a-z]", "");
        StringBuilder sb = new StringBuilder();
        String reverseStr = sb.append(str2).reverse().toString();
        if (str2.equals(reverseStr)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

    }
}
