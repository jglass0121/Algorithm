package me;

import java.util.Arrays;
import java.util.Scanner;

public class 예산 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] arr = new int[num];
        for (int i = 0; i < num; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.println(binary(arr,num));
    }

    private static int binary(int[] arr, int num) {
        int left = 0;
        int right = arr[arr.length - 1];
        while(left<=right) {
            int mid = (left+right)/2;
            long budget =0;
            for(int i=0; i<arr.length; i++) {
                if(arr[i]>mid) budget += mid;
                else budget+= arr[i];
            }
            if(budget<=num) {
                left = mid+1;
            }else {
                right = mid-1;
            }
        }
        return right;

    }

    private static long find(int[] arr, int mid) {

         long sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > mid) {
                sum += mid;
            } else {
                sum += arr[i];
            }
        }

        return sum;
    }
}
