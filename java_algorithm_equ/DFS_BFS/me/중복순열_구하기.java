package me;

import java.util.Scanner;

public class 중복순열_구하기 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        visited = new boolean[N+1];
        fac(M, N, 0, "");

    }
    static boolean[] visited;

    private static void fac(int m, int n, int depth, String res) {
        if(depth == m){
            System.out.println(res);
            return;
        }

        for (int i = 1; i <= n; i++) {
            if(!visited[i]){
                visited[i] =true;
                fac(m, n, depth + 1, res + " " + i);
                visited[i] = false;
            }
        }

    }
}
