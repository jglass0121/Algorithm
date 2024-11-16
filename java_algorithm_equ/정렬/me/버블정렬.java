package me;

import java.util.Arrays;
import java.util.Scanner;

public class 버블정렬 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.nextLine();
        String[] k = sc.nextLine().split(" ");
        int[] array = Arrays.stream(k).mapToInt(i -> Integer.parseInt(i)).toArray();
        solution(num, array);

    }

    private static void solution(int num, int[] arr) {

        for (int i = 0; i < arr.length-1; i++) { // 가장 끝 , 가장 큰 값
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if(arr[j] > arr[j + 1]){
                    //swap
                    int min = arr[j+1];
                    arr[j + 1] = arr[j];
                    arr[j] = min;
                }
            }
        }


        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
