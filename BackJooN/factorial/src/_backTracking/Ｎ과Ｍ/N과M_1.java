package _backTracking.Ｎ과Ｍ;

import java.util.Arrays;
import java.util.Scanner;

public class N과M_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        arr = new int[M];
        visited = new boolean[N+1];
        fac(N,M,0);
    }
    static boolean[] visited;
    static int[] arr;
    private static void fac(int n, int m,int depth) {
        if(m == depth){
            for (int i = 0; i < m; i++) {
                System.out.print(arr[i]+" ");
            }
            System.out.println();
            return;
        }

        for (int i = 1; i <= n; i++) {
            if(!visited[i]){
                visited[i] =true;
                arr[depth] = i;
                fac(n,m,depth+1);
                visited[i] =false;
            }

        }

    }


}
