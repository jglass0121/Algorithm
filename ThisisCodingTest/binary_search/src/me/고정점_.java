package me;

import java.util.Scanner;

public class 고정점_ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] arr = new int[num];
        for (int i = 0; i < num; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(binary(arr));
    }

    private static int binary(int[] arr) {
        int start = 0;
        int end = arr.length-1;
        while (start <= end) {
            int mid =  (start + end) / 2;
            if (arr[mid] == mid) {
                return arr[mid];
            } else if (mid < arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }

        }
        return -1;


    }
}
