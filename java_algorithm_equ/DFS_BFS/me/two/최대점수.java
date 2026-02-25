package me.two;

import java.util.Arrays;
import java.util.Scanner;

public class 최대점수 {
    static int max = 0;
    static int N;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        int M = sc.nextInt();
        int[][] arr = new int[N][2];
        for (int i = 0; i < N; i++) {
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
        }

        fac(0, 0,0, M, arr);
        System.out.println(max);
    }

    private static void fac(int depth, int sum,int time, int totalTime, int[][] arr) {


        if (time > totalTime) return;

        if (depth == N) {// 그 직전 상태에서 계산되어서 상관없음
            max = Math.max(max, sum);
            return;
        }

        fac(depth + 1, sum + arr[depth][0], time + arr[depth][1], totalTime, arr);
        fac(depth + 1, sum, time, totalTime, arr);

    }

}
