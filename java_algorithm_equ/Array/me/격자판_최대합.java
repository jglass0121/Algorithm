package me;

import java.util.Arrays;
import java.util.Scanner;

public class 격자판_최대합 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.nextLine();
        int[][] arr = new int[num][num];
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int solution = solution(arr, num);
        System.out.println(solution);

    }

    private static int solution(int[][] arr, int num) {

        int max = Integer.MIN_VALUE;
        //줄

        for (int i = 0; i < num; i++) {
            int x =0;
            int y = 0;
            for (int j = 0; j < num; j++) {
                x += arr[i][j];
                y += arr[j][i];
            }
            max = Math.max(Math.max(x, y),max);
        }

        // 대각선

        int x =0; int y = 0;
        for (int j = 0; j < num; j++) {
            x+= arr[j][j];
            y+=arr[j][num-1-j];
        }
        max = Math.max(Math.max(x, y),max);

        return max;
    }
}
