package _backTracking.Ｎ과Ｍ;

import java.util.Scanner;

public class N과M_2 {
    static boolean[] visited;
    static int[] arr;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        arr = new int[M];
        visited = new boolean[N+1];
        fac(N,M,0,1);
    }

    private static void fac(int n, int m, int depth,int start) {
        if(m == depth){
            for (int i = 0; i < depth; i++) {
                System.out.print(arr[i]+" ");
            }
            System.out.println();
            return;
        }

        for (int i = start; i <= n; i++) {
                arr[depth] = i;
                fac(n, m, depth + 1, i+1);
            }

    }
}
