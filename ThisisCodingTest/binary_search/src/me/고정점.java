package me;

import java.util.Scanner;

public class 고정점 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] arr = new int[num];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int solution = solution(num, arr);
        System.out.println("solution = " + solution);
    }

    private static int solution(int num, int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (mid == arr[mid]) {
                return mid;
            } else if (mid > arr[mid]) {
                start += 1;
            } else if (mid < arr[mid]) {
                end -= 1;
            }
        }
        return -1;
    }

}
