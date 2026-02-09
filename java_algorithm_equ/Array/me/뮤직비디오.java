package me;

import java.util.Scanner;
//오답
public class 뮤직비디오 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        sc.nextLine();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(solution(N, M, arr));

    }

    private static int solution(int n, int m, int[] arr) {
        int max = 0;
        int total = 0;

        for (int x : arr) {
            max = Math.max(max, x);
            total += x;
        }

        for (int i = max; i <= total; i++) {
            int sum = 0;
            int cnt = 1;

            for (int j = 0; j < arr.length; j++) {
                if (sum + arr[j] > i) {
                    cnt++;
                    sum = arr[j];
                } else {
                    sum += arr[j];
                }
            }

            if (m >= cnt) {
                return i;
            }
        }
        return max;
    }
}
