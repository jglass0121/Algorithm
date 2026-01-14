package me;

import java.util.Arrays;
import java.util.Scanner;

public class 미로탐색 {
    static boolean visited[][];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = 7;
        int[][] arr = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        visited = new boolean[7][7];

        dfs(arr, 0, 0);
        System.out.println(answer);
    }

    static int answer = 0;
    private static void dfs(int[][] arr, int x, int y) {
        if (x < 0 || y < 0 || x >= arr.length || y >= arr.length) {
            return;
        }
        if(arr[x][y] == 1 || visited[x][y])return;

        if (x == 6 && y == 6) {
            answer++;
            return;
        }

        if (!visited[x][y]) {
            visited[x][y] = true;
            dfs(arr, x - 1, y);
            dfs(arr, x + 1, y);
            dfs(arr, x, y - 1);
            dfs(arr, x, y + 1);
            visited[x][y] = false;
        }

    }
}
