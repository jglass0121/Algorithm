package _backTracking.Ｎ과Ｍ;

import java.util.Arrays;
import java.util.Scanner;

public class N과M_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
         M = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        res = new int[M];
        visited = new boolean[N+1];
        fac(arr,0);
    }

    static int N;
    static int M;
    static int[] res;
    static boolean[] visited;
    private static void fac(int[] arr, int depth) {

        if(M == depth){
            for (int i = 0; i < depth; i++) {
                System.out.print(res[i]+" ");
            }
            System.out.println();
            return;
        }

        for (int i = 0; i < arr.length; i++) {
            if (!visited[i]) {
                visited[i] = true;
                res[depth] = arr[i];
                fac(arr, depth + 1);
                visited[i] = false;
            }

        }
    }

}
