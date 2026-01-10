package me;

import java.util.Scanner;

public class 계단오르기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        solution(num);
    }

    private static void solution(int num) {
        int[] dp = new int[num + 1]; // 계단 오르는 방법
        dp[1] = 1;
        dp[2] = 2;

        for (int i = 3; i <= num; i++) {
            dp[i] = dp[i - 2] + dp[i - 1];
        }
        System.out.println(dp[num]);

    }


}
