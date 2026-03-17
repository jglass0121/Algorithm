package me;

import java.util.Arrays;
import java.util.Scanner;

public class 두_배열_문자합치기2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < arr.length; i++) {
            arr[i]= sc.nextInt();
        }
        int M = sc.nextInt();
        int[] arr2 = new int[M];
        for (int i = 0; i < arr2.length; i++) {
            arr2[i]= sc.nextInt();
        }

        int[] solution = solution(arr, arr2);
        Arrays.stream(solution).forEach(i-> System.out.print(i+" "));

    }

    private static int[] solution(int[] arr, int[] arr2) {
        int[] res = new int[arr.length + arr2.length];
        int lt1=0,lt2=0;
        int idx =0;
        while (lt1 < arr.length && lt2 < arr2.length){
            int one = arr[lt1];
            int two = arr2[lt2];
            if(one < two){
                res[idx++] = one;
                lt1++;
            }else if(one > two){
                res[idx++] = two;
                lt2++;
            }else{
                res[idx++]=one;
                res[idx++]=two;
                lt1++; lt2++;
            }
        }

        if(arr.length > arr2.length){
            for (int i = lt1; i <arr.length ; i++) {
                res[idx++] = arr[i];
            }


        }else{
            for (int i = lt2; i <arr2.length ; i++) {
                res[idx++] = arr2[i];
            }

        }

        return res;
    }
}
