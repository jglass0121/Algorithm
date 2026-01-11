package me;

import java.util.Scanner;

public class 수열추측하기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int F = sc.nextInt();

        dfs(F, N,0);

    }

    private static void dfs(int val, int n, int depth) {
        if (n == depth) {
            return;
        }
        // depth+1만큼의 수로

    }
}
