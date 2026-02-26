package me;

import java.util.Scanner;

public class 고정점2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] arr = new int[num];
        for (int i = 0; i < num; i++) {
            arr[i] = sc.nextInt();
        }

        int start= 0;
        int end = arr.length-1;
        int res = -1;
        while (start <= end) {
            int mid = (start+end)/2;
            if (arr[mid] == mid) {
                res = mid;
                break;
            } else if (arr[mid] < mid) {
                start = mid+1;
            } else {
                end = mid -1;
            }
        }
        System.out.println(res);

    }
}
