package me;

import java.util.Scanner;

public class 점수계산 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] arr = new int[num];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        solution(arr);
    }

    private static void solution(int[] arr) {
        int val = 0;
        int res = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                val = 0;
            }
            if (arr[i] == 1) {
                res += ++val;
            }

        }

        System.out.println(res);

    }
}
