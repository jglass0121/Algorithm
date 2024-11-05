package me;

import java.util.Scanner;

public class 큰_수_출력하기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] arr = new int[num];
        for (int i = 0; i < num; i++) {
            arr[i] = sc.nextInt();
        }

        StringBuilder solution = solution(arr);
        System.out.println(solution.toString());

    }

    private static StringBuilder solution(int[] arr) {
        StringBuilder sb = new StringBuilder();
        sb.append(arr[0]).append(" ");
        int idx = 0;
        for (int i = 1; i < arr.length; i++) {
            if(arr[idx] < arr[i]) {
                sb.append(arr[i]).append(" ");
            }
            idx++;
        }

        return sb;


    }
}
