package me;

import java.util.Scanner;

public class 숫자만추출3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        str = str.replaceAll("[^0-9]", "");
        System.out.println(Integer.parseInt(str));
    }
}
