package me;

import java.util.Arrays;
import java.util.Scanner;

public class 마구간 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int C = sc.nextInt();
        sc.nextLine();
        int[] arr = new int[N];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);
        solution(arr, C);

    }

    private static void solution(int[] arr, int c) {
        int start = arr[0];
        int end = (arr[arr.length - 1] - arr[0]) + 1;
         int answer = 0;

        while (start <= end) {
            int mid = (start+end)/2;
            if (dis(arr, c, mid) < end) {

            } else {

            }
        }
    }

    private static int dis(int[] arr, int c, int mid) { //2
        int first = arr[0];
        int cnt = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] - first > mid) {
                first = arr[i];
                cnt++;
            }

        }

        return 0;
    }
}
