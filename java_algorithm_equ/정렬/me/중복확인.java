package me;

import java.util.Arrays;
import java.util.Scanner;

public class 중복확인 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.nextLine();
        String[] arr = sc.nextLine().split(" ");
        int[] arr2 = new int[num];
        for (int j = 0; j < arr.length; j++) {
            arr2[j] = Integer.parseInt(arr[j]);
        }
        
        Arrays.sort(arr2);
        int prev = arr2[0];
        boolean isD = false;
        for (int i = 1; i < arr2.length; i++) {
            if (prev == arr2[i]) {
                isD = true;
            }
            prev = arr2[i];
        }

        if (isD) {
            System.out.println("D");
        } else {
            System.out.println("U");
        }


    }
}
