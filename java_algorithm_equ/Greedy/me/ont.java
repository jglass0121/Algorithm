package me;

import java.util.Scanner;

public class ont {
    public static void main(String[] args) {
        String a = "dkfndkfnAAAfndk1231 23 ";
        for (int i = 0; i < a.length(); i++) {
            char c = a.charAt(i);
            if (c == ' ') {

                System.out.println(" 공백");
            }

            if (Character.isUpperCase(c)) {
                System.out.println("cL");
            }

            if (Character.isLowerCase(c)) {
                System.out.println("lower");
                System.out.println(c);
            }

            if (Character.isDigit(c)) {
                System.out.println("c");
            }
        }
        
    }
}
