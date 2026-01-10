package me;

import java.util.Arrays;
import java.util.Scanner;

public class LIS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.nextLine();
        int[] arr = new int[num];
        for (int i = 0; i < num; i++) {
            arr[i] =sc.nextInt();
        }

        System.out.println(solution(arr));

    }

    private static int solution(int[] arr) {
        int[] dp = new int[arr.length];
        Arrays.fill(dp, 1);

        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < i; j++) {
                if (arr[i] > arr[j]) {
                    dp[i] = Math.max(dp[j] + 1, dp[i]);
                }
            }
        }

        int max =0;
        for (int i = 0; i < dp.length; i++) {
            max = Math.max(dp[i],max);
        }
        return max;

    }
}
