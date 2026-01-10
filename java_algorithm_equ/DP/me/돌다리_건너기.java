package me;

import java.util.Scanner;

public class 돌다리_건너기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        solution(num);
    }

    private static void solution(int num) {
        int[] dp = new int[num + 2]; // 돌다리를 건널수 있는 개수
        dp[1]= 1;
        dp[2] = 2; // 2가지 방식으로 걸널 수 있다.
        for (int i = 3; i <= num+1; i++) {
            dp[i] = dp[i - 2] + dp[i - 1];
        }

        System.out.println(dp[num+1]);

    }
}
