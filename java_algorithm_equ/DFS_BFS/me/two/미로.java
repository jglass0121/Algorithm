package me.two;

import java.util.Arrays;
import java.util.Scanner;

public class 미로 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[7][7];
        for (int i = 0; i < arr.length; i++) {
            String[] str = sc.nextLine().split(" ");
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = Integer.parseInt(str[j]);
            }
        }


        arr[0][0] =1;
        DFS(arr, 0, 0);
        System.out.println(cnt);
    }

    static int[] dx = {1, -1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    static int cnt = 0;
    static boolean[][] visited;
    private static void DFS(int[][] arr, int x, int y) {
        if (x == 6 && y == 6) {
            cnt++;
            return;
        }

        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];
            if( nx <  0 || ny < 0 || nx >= arr.length || ny>= arr.length) continue;
            if (arr[nx][ny] == 0 ) {
                arr[nx][ny] =1;
                DFS(arr, nx, ny);
                arr[nx][ny] = 0;
            }
        }

    }
}
