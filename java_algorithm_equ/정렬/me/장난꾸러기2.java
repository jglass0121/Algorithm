package me;

import java.util.Arrays;
import java.util.Scanner;

public class 장난꾸러기2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.nextLine();
        int[] arr = new int[num];
        for (int i = 0; i < num; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(solution(num, arr));


    }

    private static String solution(int num, int[] arr) {
        // 정렬된 것과 다른 것 index 저장
        int[] b = Arrays.copyOf(arr,arr.length);
        Arrays.sort(b);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < num; i++) {
            if (arr[i] != b[i]) {
                sb.append(i + 1).append(" ");
            }
        }
        return sb.toString();
    }
}
