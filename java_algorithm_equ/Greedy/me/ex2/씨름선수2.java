package me.ex2;

import java.util.Arrays;
import java.util.Scanner;

public class 씨름선수2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[][] arr = new int[N][2];
        for (int i = 0; i < arr.length; i++) {
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
        }

        solution(arr, N);

    }

    private static void solution(int[][] arr, int num) {

        Arrays.sort(arr,(a,b)->{

            if (a[0] == b[0]) {
                return a[1] - b[1];
            }

            return a[0] - b[0];
        });


        int cnt = 0;
        int max = 0;

        for (int i = num - 1; i >= 0; i--) {
            int now = arr[i][1];

            if (now > max) {
                cnt++;
                max = now;
            }
        }

        System.out.println(cnt);

    }
}
