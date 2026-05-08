package me;

import java.util.Scanner;

public class _1198 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            total += arr[i];
        }

        DFS(arr, N, 0, 0);
        if (res) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

    }

    static boolean res =false;
    static int total =  0;

    private static void DFS(int[] arr, int n, int depth, int sum) {
        if(res) return;
        if (sum > total / 2) return;

        if (depth == n) {
            if((total - sum) == sum){ // 반값이라면
                res = true;
                return;
            }
        } else {
            DFS(arr, n, depth + 1, sum + arr[depth]);
            DFS(arr,n,depth+1, sum);
        }
    }
}
