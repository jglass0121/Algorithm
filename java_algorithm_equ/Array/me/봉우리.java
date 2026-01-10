package me;

import java.util.Arrays;
import java.util.Scanner;

public class 봉우리 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[][] arr= new int[num+2][num+2];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if(i == 0 || i == arr.length-1){
                    arr[i][j] =0;
                    continue;
                }
                if(j == 0 || j == arr.length-1){
                    arr[i][j] =0;
                    continue;
                }

                arr[i][j] = sc.nextInt();
            }
        }
        solution(arr);
    }

    private static void solution(int[][] arr) {
        int[] dx = {-1,1,0,0};
        int[] dy = {0,0,-1,1};

        int answer= 0;
        for (int y = 1; y < arr.length-1; y++) {
            for (int x = 1; x < arr.length-1; x++) {
                int num = arr[y][x];
                int max=0;
                for (int i = 0; i < 4; i++) {
                    int ny = y + dy[i];
                    int nx = x + dx[i];
                    max = Math.max(arr[ny][nx],max);
                }
                if(num > max){
                    answer++;
                }
            }
        }

        System.out.println(answer);

    }
}
