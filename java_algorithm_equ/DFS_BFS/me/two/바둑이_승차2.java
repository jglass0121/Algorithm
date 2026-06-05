package me.two;

import java.util.Arrays;
import java.util.Scanner;

public class 바둑이_승차2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] s = sc.nextLine().split(" ");
        int total = Integer.parseInt(s[0]);
        int num = Integer.parseInt(s[1]);

        int[] arr = new int[num];
        for (int i = 0; i < num; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        dfs(0,0, total, arr);

        System.out.println(max);
    }

    static int max = Integer.MIN_VALUE;
    private static void dfs(int res, int depth, int total, int[] arr) {
        if (depth == arr.length) {
            if(total == res) {
                max = res;
            }

            if(total > res){
                max = Math.max(max, res);
            }
            return;
        }

        dfs( arr[depth]+res , depth + 1, total, arr);
        dfs(res, depth + 1, total, arr);
    }
}
