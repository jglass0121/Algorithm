package me;

import java.awt.desktop.ScreenSleepEvent;
import java.util.Arrays;
import java.util.Scanner;

public class 개미전사 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] arr = new int[num];
        for (int i = 0; i < num; i++) {
            arr[i] = sc.nextInt();
        }

        solution(arr);
    }

    private static void solution(int[] arr) {

        int[] dp = new int[arr.length];
        //

        for (int i = 0; i < arr.length; i++) {

            dp[i] = arr[i];
            for (int j = i + 2; j < arr.length; j++) {
                dp[i] = Math.max(dp[i],arr[i] + arr[j]);
            }
        }


        System.out.println(Arrays.toString(dp));
        int max = dp[0];
        for (int i = 1; i < dp.length; i++) {
            max = Math.max(dp[i],max);
        }

        System.out.println(max);


    }
}
