package me;

import java.util.Arrays;
import java.util.Scanner;

public class 섬나라_아일랜드 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        arr = new int[num][num];

        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int answer = 0;
        for (int i = 0; i < num; i++) {
            for (int j = 0; j <num; j++) {
                if(arr[i][j] == 1){
                    dfs(i, j);
                    answer++;
                }
            }
        }
        System.out.println(answer);

    }

    static int[][] arr;

    private static void dfs(int x, int y) {
        if(x<0|| y<0 || x>= arr.length || y>= arr.length)return;

        if(arr[x][y] == 1){
            arr[x][y] = 0;
            dfs(x-1,y);
            dfs(x,y-1);
            dfs(x+1,y);
            dfs(x,y+1);
            dfs(x+1,y+1);
            dfs(x-1,y-1);
            dfs(x+1,y-1);
            dfs(x-1,y+1);
        }
    }
}
