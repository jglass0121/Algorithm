package me;

import java.util.Scanner;
//dfs
public class 연속_부분수열 {
    static int cnt = 0;
    static int M, N;
    static int[] arr;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        M = sc.nextInt(); // N (수열의 길이)
        N = sc.nextInt(); // M (목표 합)

        arr = new int[M];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        // 모든 가능한 시작점에 대해 DFS 시작
        for (int i = 0; i < M; i++) {
            dfs(i, 0);
        }

        System.out.println("cnt = " + cnt);
        sc.close();
    }

    private static void dfs(int index, int sum) {
        // 현재 인덱스의 값을 합에 더함
        sum += arr[index];

        // 목표 합을 찾으면 카운트 증가
        if (sum == N) {
            cnt++;
            return;
        }

        // 합이 목표보다 크거나 인덱스가 범위를 벗어나면 중단
        if (sum > N || index + 1 >= M) {
            return;
        }

        // 다음 인덱스로 진행하여 연속 부분수열을 탐색
        dfs(index + 1, sum);
    }
}