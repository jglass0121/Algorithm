package th;

import java.util.Scanner;

public class LIS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(soltuion(arr));

    }

    private static int soltuion(int[] arr) {
        int answer = 0;
        int[] dp = new int[arr.length];
        dp[0] = 1;
        for (int i = 1; i < arr.length; i++) {
            int max = 0;
            for (int j = i - 1; j >= 0; j--) {
                if (arr[j] < arr[i] && dp[j]  > max) { // 작을 경우
                    max = dp[j];
                }
                dp[i] = max+1;
                answer = Math.max(dp[i], answer);
            }
        }
        return answer;
    }
}
