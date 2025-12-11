package 실버3;

import java.util.Arrays;
import java.util.Scanner;

// 투 포인터
public class 두_수의_합 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        int K = sc.nextInt();
        solution(N, arr, K);

    }

    private static void solution(int n, int[] arr, int k) {
        Arrays.sort(arr);
        int start = 0;
        int end = n - 1;
        int cnt = 0;
        while (start < end) {
            int sum = arr[start] + arr[end];
            if (sum == k) {
                cnt++;
                start++;
                end--;
            } else if (sum < k) {
                start++;
            } else {
                end--;
            }
        }
        System.out.println(cnt);
    }
}
