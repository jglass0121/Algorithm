package me;

import java.util.Scanner;

public class 특정개수 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int num = sc.nextInt();
        int target = sc.nextInt();
        int[] arr = new int[num];
        for (int i = 0; i < num; i++) {
            arr[i] = sc.nextInt();
        }
        int res =  upbound(target, arr)- lowerbound(target, arr);
        if(res == 0) res = -1;
        System.out.println("res = " + res);

    }

    private static int upbound(int target, int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int mid = (start + end) / 2;
            if (arr[mid] < target) {
                end = mid;
            } else {
                start =mid+1;
            }
        }
        return end;
    }

    private static int lowerbound(int target, int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int mid = (start + end) / 2;
            if (arr[mid] >= target) {
                end = mid;
            } else {
                start =mid+1;
            }
        }
        return end;
    }

}
