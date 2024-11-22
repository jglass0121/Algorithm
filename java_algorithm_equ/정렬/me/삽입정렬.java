package me;

import java.util.Scanner;

public class 삽입정렬 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] arr = new int[num];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int[] sort = solution(num, arr);
        for (int i = 0; i < sort.length; i++) {
            System.out.print(sort[i]+" ");
        }
    }

    private static int[] solution(int num, int[] arr) {


        for (int i = 1;  i < num; i++) {
            for (int j = i ; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
            }
        }

        return arr;
    }
}
