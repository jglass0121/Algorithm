package me.two;

import java.util.Scanner;

public class 바둑이_승차 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int C = sc.nextInt();
        N = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        DFS(arr, C, 0, 0);
        System.out.println(max);
    }
    static int N;

    static int max = 0;

    private static void DFS(int[] arr, int c, int sum, int depth) {

        if(sum > c) return;

        if(sum == c) {
            max = c;
            return;
        }

        if(depth == N ){
            if(max < sum){
                max = sum;
            }
            return;
        }else{
            DFS(arr, c, arr[depth] + sum, depth+1);
            DFS(arr, c, sum, depth+1);

        }

    }
}
