package me;

import java.util.Scanner;

public class 큰수출력하기2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] arr = new int[num];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        StringBuilder sb = new StringBuilder();
        sb.append(arr[0]).append(" ");
        for (int i = 1; i < arr.length; i++) {
            // i < i+1
            if (arr[i-1] < arr[i]) {
                sb.append(arr[i]).append(" ");
            }
        }

        System.out.println(sb.toString().trim());

    }
}
