package _backTracking.실버3;

import java.util.Scanner;

public class N과M1 {
    static int[] arr;
    static boolean[] visited;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        arr = new int[M];
        visited = new boolean[N];
        fac(N, M,0);

    }

    private static void fac(int n, int m, int depth) {
        if (depth == m) {
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i]+" ");
            }
            System.out.println();
            return;
        }

        for (int i = 0; i < n; i++) {

            if (!visited[i]) {
                visited[i] = true;
                arr[depth] = i + 1;
                fac(n, m, depth + 1);
                visited[i] = false;

            }

        }

        return;
    }
}
