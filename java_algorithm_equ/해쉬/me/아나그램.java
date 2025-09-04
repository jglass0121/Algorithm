package me;

import java.util.Arrays;
import java.util.Scanner;

public class 아나그램 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String one = sc.nextLine();
        String two = sc.nextLine();
        String[] oneSplit = one.split("");
        String[] twoSplit = two.split("");

        Arrays.sort(oneSplit);
        Arrays.sort(twoSplit);

        if(Arrays.equals(oneSplit,twoSplit)){
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }

    }
}
