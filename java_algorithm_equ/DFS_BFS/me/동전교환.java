package me;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class 동전교환 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.nextLine();
        Integer[] arr = new Integer[num];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int M = sc.nextInt();
        Arrays.sort(arr, Collections.reverseOrder());

        fac(0, M, arr, 0);
        System.out.println(answer);

    }

    static int answer = Integer.MAX_VALUE;
    private static void fac(int depth, int m, Integer[] arr, int sum) {
        if (answer <= depth) {
            return;
        }

        // sum 값이 큰 경우
        if (sum > m) {
            return;
        }

        if (sum == m) {
            answer = Math.min(depth, answer);
            return;
        }


        for (int i = 0; i < arr.length; i++) {
            fac(depth + 1, m, arr, arr[i]+sum);
        }

    }
}
