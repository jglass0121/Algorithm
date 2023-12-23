package _backTracking.실버3;

import java.util.Arrays;
import java.util.Scanner;

public class N과M3 {
    static int N;
    static int M;
    static int[] arr;
    static int[] res;
    static boolean[] visited;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         N = sc.nextInt();
         M = sc.nextInt();
        arr = new int[N];
        res = new int[N];
        visited = new boolean[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        fac(0);
        
    }

    private static void fac(int depth) {
        if (depth == M) {
            for (int i = 0; i < M; i++) {
                System.out.print(res[i]+" ");
            }
            System.out.println();
            return;
        }

        for (int i = 0; i < arr.length; i++) {

            if (!visited[i]) {
                visited[i] = true;
                res[depth] = arr[i];
                fac(depth+1);
                visited[i] = false;
            }
        }

    }
}
