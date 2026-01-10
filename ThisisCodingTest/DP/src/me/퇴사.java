package me;

import java.util.Scanner;

public class 퇴사 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] t = new int[n + 1];
        int[] p = new int[n + 1];

        for (int i = 1; i <= n; i++) {
            t[i] = sc.nextInt();
            p[i] = sc.nextInt();
        }

        int[] dp = new int[n + 2]; // n+1일까지 고려

        for (int i = 1; i <= n; i++) {

            // 상담 안 하는 경우
            dp[i + 1] = Math.max(dp[i + 1], dp[i]);

            // 상담 하는 경우
            if (i + t[i] <= n + 1) {
                dp[i + t[i]] = Math.max(dp[i + t[i]], dp[i] + p[i]);
            }
        }

        System.out.println(dp[n + 1]);
    }
}
