package me;

import java.util.Arrays;
import java.util.Scanner;

public class 등수구하기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] arr = new int[num];
        for (int i = 0; i < num; i++) {
            arr[i] = sc.nextInt();
        }

        //cnt
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < num; i++) {
            int check = arr[i];
            int cnt = 1;
            for (int j = 0; j < num; j++) {
                if(i==j) continue;
                if (check < arr[j]) {
                    cnt++;
                }
            }
            sb.append(cnt).append(" ");
        }

        System.out.println(sb.toString());
    }
}
