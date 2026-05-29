package me.two;

import java.util.Scanner;

public class 섬나라_아일랜드 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int cnt= 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i][j] == 1) {
                    dfs(i,j,arr);
                    cnt++;
                }
            }
        }

        System.out.println(cnt);
    }

    private static void dfs(int x, int y, int[][] arr) {
        if(x < 0 || y<0 || x >= arr.length || y >=arr.length) return;

        if (arr[x][y] == 1) {
            arr[x][y] = 0;
            dfs(x - 1, y, arr);
            dfs(x , y-1, arr);
            dfs(x +1 , y, arr);
            dfs(x, y+1, arr);
            dfs(x+1, y-1, arr);
            dfs(x+1, y+1, arr);
            dfs(x-1, y+1, arr);
            dfs(x-1, y-1, arr);
        }
    }
}
