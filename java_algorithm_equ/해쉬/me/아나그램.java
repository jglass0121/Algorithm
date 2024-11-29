package me;

import java.util.Collection;
import java.util.HashMap;
import java.util.Scanner;

public class 아나그램 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String one = sc.nextLine();
        String two = sc.nextLine();
        solution(one, two);

    }

    private static void solution(String one, String two) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < one.length(); i++) {
            map.put(one.charAt(i), map.getOrDefault(one.charAt(i), 0) + 1);
        }

        for (int i = 0; i < one.length(); i++) {
            map.put(two.charAt(i), map.getOrDefault(two.charAt(i), 0) - 1);
        }


        boolean b = true;
        for (Integer i : map.values()) {
            if (i != 0) {
                b = false;
            }
        }

        if (b) {
            System.out.println("YES");
        } else {
            System.out.println("NO");

        }
    }
}
