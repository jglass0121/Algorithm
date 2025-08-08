package me;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;

//set
public class 중복문자제거 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        LinkedHashSet<String> set = new LinkedHashSet<>();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            set.add(""+c);
        }


        String collect = set.stream().collect(joining());
        System.out.println(collect);

    }
}
