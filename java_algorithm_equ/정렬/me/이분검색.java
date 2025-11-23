package me;

import java.util.Arrays;
import java.util.Scanner;

public class 이분검색 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == M) {
                System.out.println(i+1);
                break;
            }
        }

    }
}
