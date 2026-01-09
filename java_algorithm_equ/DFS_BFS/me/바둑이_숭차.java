package me;

import java.util.Scanner;

public class 바둑이_숭차 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int num = sc.nextInt();

        sc.nextLine();
        int[] arr = new int[num];
        for (int i = 0; i < num; i++) {
            arr[i] = sc.nextInt();
        }

        fac(k,arr,0,0);
        System.out.println(answer);
    }


    static int answer = 0;

    private static void fac(int k, int[] arr, int sum, int depth) {
        if(sum > k) return;
        if(sum <= k){
            answer = Math.max(sum,answer);
        }

        if(depth == arr.length){
            return;
        }
        if(sum == k){
            answer = k;
            return;
        }

        fac(k,arr,sum+arr[depth],depth+1);
        fac(k,arr,sum,depth+1);

    }

}
