package _backTracking.Ｎ과Ｍ;

import java.util.Scanner;

public class N과M_3 {

    static int[] arr;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        arr = new int[M];
        fac(N,M,0);
        System.out.println(sb);
    }

    static StringBuilder sb = new StringBuilder();

    private static void fac(int n, int m, int depth) {
        if (depth == m) {
            if(m == depth){
                for (int i = 0; i < depth; i++) {
                    sb.append(arr[i]).append(" ");
                }
                sb.append("\n");
                return;
            }
        }

        for (int i = 1; i <= n; i++) {
            arr[depth] = i;
            fac(n, m, depth + 1);
        }
    }
}
