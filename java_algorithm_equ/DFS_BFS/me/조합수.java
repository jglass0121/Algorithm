package me;

import java.util.Scanner;

public class 조합수 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        DFS(n, k);
    }

    static int[][] dy = new int[35][35];
    private static int DFS(int n, int r) {
        if(dy[n][r] > 0) return dy[n][r];
        if (n == r || r == 0) {
            return 1;
        }else{
            return dy[n][r] = DFS(n - 1, r - 1) + DFS(n - 1, r);
        }


    }

}
