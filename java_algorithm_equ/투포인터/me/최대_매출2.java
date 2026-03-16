package me;

import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class 최대_매출2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] arr = new int[N];
        sc.nextLine();
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        solution(N, K, arr);

    }

    private static void solution(int n, int k, int[] arr) {
        int sum = 0;

        //초기화
        for (int i = 0; i < k; i++) {
            sum+= arr[i];
        }
        int max = sum;

        int s = 0, e = k;
        while (e != arr.length) {
            sum -= arr[s++];
            sum += arr[e++];
            max = Math.max(max, sum);
        }

        System.out.println(max);
    }
}
