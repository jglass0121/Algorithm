package me.two;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class 회의실_배정 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[][] arr = new int[num][2];

        for (int i = 0; i < num; i++) {
            arr[i][0] =  sc.nextInt();
            arr[i][1] =  sc.nextInt();
        }

        solution(arr);
    }

    private static void solution(int[][] arr) {
        Arrays.sort(arr, (a, b) -> {
            if (a[1] == b[1]) {
                return a[0] - b[0];
            }
            return a[1] - b[1];
        });

        int cnt = 1;
        int start = arr[0][0];
        int end = arr[0][1];
        for (int i = 1; i < arr.length; i++) {
            int nS = arr[i][0];
            int nE = arr[i][1];
            if (end > nS) {
                continue;
            }
            if (nS >= end) {
                //업데이트
                cnt++;
                start = nS;
                end= nE;
            }
        }

        System.out.println( cnt);
    }
}
