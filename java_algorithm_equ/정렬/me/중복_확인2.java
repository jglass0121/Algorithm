package me;

import java.util.Arrays;
import java.util.Scanner;

public class 중복_확인2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        String solution = solution(N, arr);
        System.out.println( solution);
    }

    private static String solution(int n, int[] arr) {
        Arrays.sort(arr);
        int prev = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == prev) {
                return "D";
            }
            prev = arr[i];

        }

        return "U";
    }
}
