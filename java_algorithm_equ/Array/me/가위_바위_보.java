package me;

import java.util.Arrays;
import java.util.Scanner;

public class 가위_바위_보 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] arr1 = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] arr2 = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        solution(arr1, arr2);
    }

    private static void solution(int[] arr1, int[] arr2) {

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < arr1.length; i++) {
            String answer = "";
            int a = arr1[i];
            int b =  arr2[i];
            // 1 - 가위 2 바위 3 보
            //1 3 - 1
            // 2  1

        }


    }
}
