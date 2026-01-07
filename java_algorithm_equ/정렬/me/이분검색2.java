package me;

import java.util.Arrays;
import java.util.Scanner;

public class 이분검색2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int M = sc.nextInt();
        sc.nextLine();
        int[] arr = new int[num];
        for (int i = 0; i < num; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(solution(num, M, arr));

    }

    private static int solution(int num, int m, int[] arr) {
        Arrays.sort(arr);

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == m) {
                return i+1;
            }
        }
        return -1;
    }
}
