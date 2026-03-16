package me;

import java.util.Arrays;
import java.util.Scanner;

public class 장난꾸러기3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int[] arr2 = Arrays.copyOf(arr, arr.length);
        Arrays.sort(arr);

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != arr2[i]) {
                sb.append(i+1).append(" ");
            }
        }
        System.out.println(sb.toString());

    }
}
