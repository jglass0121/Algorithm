package me.two;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class 동전교환 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         N = sc.nextInt();
         arr = new Integer[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        res = sc.nextInt();
        Arrays.sort(arr, Collections.reverseOrder());

        dfs(0, 0);
        System.out.println(max);
    }
    static int N;
    static int res;
    static Integer[] arr;
    static int max = Integer.MAX_VALUE;

    private static void dfs(int cnt, int sum) {
        if(sum > res) return;
        if(cnt >= max) return;
        if(sum == res) {
            max = Math.min(cnt, max);
            return;
        }
        for (int i = 0; i < arr.length; i++) {
            dfs(cnt + 1, sum + arr[i]);
        }
    }



}
