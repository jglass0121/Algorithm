package me;

import java.util.Scanner;

public class 보이는학셍2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        // max가 뭔지. cmt
        // arr[i] > max { cnt++}
        int[] arr = new int[num];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int cnt = 1;
        int max = arr[0];
        for (int i = 1; i < num; i++) {
            if (arr[i] > max) {
                cnt++;
                max = arr[i];
            }
        }

        System.out.println(cnt);
    }
}
