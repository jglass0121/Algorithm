package me;

import java.util.Scanner;

public class 공통원소_구하기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String[] one = sc.nextLine().split(" ");
        int[] arr = new int[num];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(one[i]);
        }

        int tNum = sc.nextInt();
        String[] two = sc.nextLine().split(" ");
        int[] arr2 = new int[tNum];
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = Integer.parseInt(two[i]);
        }


    }


}
