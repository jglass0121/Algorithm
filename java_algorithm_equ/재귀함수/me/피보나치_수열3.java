package me;

import java.util.Scanner;

public class 피보나치_수열3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        arr = new int[num + 1];
         fac(num);
        for (int i = 1; i <= num; i++) {
            System.out.print(arr[i]+" ");
        }

    }

    static int[] arr;
    private static int fac(int num) {
        if(num == 1) return arr[num]=1;
        if(num == 2) return arr[num] =1;

        if(arr[num] !=0 ) return arr[num];
        arr[num] = fac(num-1)+ fac(num-2);
        return arr[num];
    }
}
