package me;

import java.util.Arrays;
import java.util.Scanner;

public class 장난꾸러기 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.nextLine();
        String[] str = sc.nextLine().split(" ");
        int[] origin = new int[str.length];
        for (int i = 0; i < str.length; i++) {
            origin[i] = Integer.parseInt(str[i]);
        }
        int[] newOne = Arrays.copyOf(origin, origin.length);
        Arrays.sort(newOne);

        int idx = 0;
        for (int i = 0; i < origin.length; i++) {
            if (origin[i] != newOne[i]) {
                System.out.print(i+1+" ");
                continue;
            }
        }


    }
}
