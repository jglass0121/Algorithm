package me;

import java.util.Arrays;
import java.util.Scanner;

public class 중복확인3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] arr = new int[num];
        for (int i = 0; i < num; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(solution(arr));

    }

    private static String solution(int[] arr) {
        Arrays.sort(arr);

        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i] == arr[i + 1]) {
                return "D";
            }
        }

        return "U";
    }
}
