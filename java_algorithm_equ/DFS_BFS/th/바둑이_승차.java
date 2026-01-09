package th;

import java.util.Scanner;

public class 바둑이_승차 {

    static int c;
    static  int n;
    static int answer = Integer.MAX_VALUE;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        c = sc.nextInt();
        n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        DFS(0,0,arr);
    }

    private static void DFS(int depth, int sum, int[] arr) {
        if(sum > c) return;
        if(depth == n){
            answer = Math.max(answer,sum);
        }else {
            DFS(depth+1,sum+arr[depth],arr);
            DFS(depth+1,sum,arr);

        }

    }
}
