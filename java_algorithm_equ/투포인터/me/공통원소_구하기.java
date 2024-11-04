package me;

import java.util.Arrays;
import java.util.Scanner;

public class 공통원소_구하기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] arr1 = new int[num];
        for (int i = 0; i < num; i++) {
            arr1[i] = sc.nextInt();
        }
        int num2 = sc.nextInt();
        int[] arr2 = new int[num2];
        for (int i = 0; i < num2; i++) {
            arr2[i] = sc.nextInt();
        }

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        int startOne = 0, startTwo = 0;
        StringBuilder sb = new StringBuilder();

        while (startOne < num && startTwo < num2) {
            if (arr1[startOne] == arr2[startTwo]) {
                sb.append(arr1[startOne]).append(" ");
                startOne++;
                startTwo++;
                continue;
            }
            if (arr1[startOne] > arr2[startTwo]) {
                startTwo++;
            } else {
                startOne++;
            }
        }

        System.out.println(sb.toString());


    }
}
