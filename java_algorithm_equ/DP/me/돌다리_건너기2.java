package me;

import java.util.Arrays;
import java.util.Scanner;

public class 돌다리_건너기2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        solution(num);
    }

    private static void solution(int num) {
        int[] dp = new int[num+2];
        dp[1] = 1;
        dp[2] = 2;

        for (int i = 3; i <= num+1; i++) {
            dp[i] = dp[i - 1]+ dp[i - 2];
        }

        System.out.println(dp[num+1]);

    }
}
