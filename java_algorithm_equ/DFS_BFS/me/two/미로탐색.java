package me.two;

import java.util.Arrays;
import java.util.Scanner;

public class 미로탐색 {
    static int[][] arr;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        arr = new int[7][7];
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                arr[i][j] = sc.nextInt();
            }
            sc.nextLine();
        }
        arr[0][0] = 1; // 시작점 방문 처리


        dfs(0,0);
        System.out.println(cnt);
    }

    static int[] dx  = {1,-1,0,0};
    static int[] dy  = {0,0,1,-1};

    static int cnt = 0;
    private static void dfs(int x, int y) {
        if (x == 6 && y == 6) {
            cnt++;
            return;
        }

        for (int i = 0; i < 4; i++) {


            int nx = x + dx[i];
            int ny = y + dy[i];

            if (nx >= 0 && ny >= 0 && nx < 7 && ny < 7 && arr[nx][ny] == 0) {
                arr[nx][ny] = 1; // 방문
                dfs(nx, ny);
                arr[nx][ny] = 0; // 복구
            }
        }


    }
}
