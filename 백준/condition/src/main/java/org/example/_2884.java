package org.example;

import java.util.Scanner;

public class _2884 {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        int hour1 = sc.nextInt();
        int min1 = sc.nextInt();
         min1 -= 45;

        if (min1 < 0) {
            hour1 -= 1;
            min1 = min1 + 60;
            if (hour1 < 0) {
                hour1 = 23;
            }
        }
        System.out.print(hour1 +" ");
        System.out.print(min1);
    }
}
