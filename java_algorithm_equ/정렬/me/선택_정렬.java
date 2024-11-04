package me;

import java.util.Arrays;
import java.util.Scanner;

public class 선택_정렬 {
    public static void main(String[] args) {
        Scanner sc=  new Scanner(System.in);
        int num = sc.nextInt();
        int[] arr = new int[num];
        for (int i = 0; i < num; i++) {
            arr[i] = sc.nextInt();
        }

        solution(arr);
        Arrays.stream(arr).forEach(i -> System.out.print(i + " "));

    }

    private static int[] solution(int[] arr) {

        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    swap(i, j, arr);
                }
            }
        }

        return arr;

    }

    private static int[] swap(int i, int j, int[] arr) {
        int sw = arr[i];
        arr[i] = arr[j];
        arr[j] = sw;

        return arr;

    }
}
