package me;

import java.util.Arrays;
import java.util.Scanner;

// 해시, for
public class 중복_확인2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] arr = new int[num];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        if (solution(arr, num)) {
            System.out.println("D");
        } else {
            System.out.println("U");
        }
    }

    private static boolean solution(int[] arr, int num) {
        Arrays.sort(arr); // n log n

        int prev = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(prev == arr[i]){
                return true;
            }else{
                prev = arr[i];
            }
        }
        return false;
    }
}
