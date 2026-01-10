package me;

import java.util.Scanner;
//down-up
public class 피보나치_수열2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(solution(num));


    }

    private static String solution(int num) {
        int[] arr = new int[num];
        arr[0] = 1;
        arr[1] = 1;
        StringBuilder sb = new StringBuilder();
        sb.append(1).append(" ").append(1);

        for (int i = 2; i < num; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
            sb.append(arr[i]).append(" ");
        }

        return sb.toString();
        
    }
}
