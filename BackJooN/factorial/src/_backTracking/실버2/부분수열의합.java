package _backTracking.실버2;

import java.util.Scanner;

public class 부분수열의합 {
    static int[] arr;
    static int N;
    static int S;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         N = sc.nextInt();
         S = sc.nextInt();
        arr = new int[N];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        fac(0,0);
    }

    static int cnt = 0;
    private static void fac(int depth,int sum) {
        if (depth == N) { // 배열 모두 탐색
            if (sum == S) {
                cnt++;
            }
            return;
        }


        fac(depth + 1, sum + arr[depth]);
        fac(depth + 1, sum );
    }
}
