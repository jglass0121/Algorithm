package me.two;

import java.util.Scanner;

public class 최대점수2 {
    static int[][] arr;
    static int N;
    static int M;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        System.out.println("M = " + M);
        sc.nextLine();
        arr= new int[N][2];
        for (int i = 0; i < N; i++) {
            arr[i][0] = sc.nextInt(); //점수
            arr[i][1] = sc.nextInt(); // 시간
        }

        DFS(0,0,0);
        System.out.println("max = " + max);

    }

    static int max = 0;

    private static void DFS(int sum, int depth,int time) {
        if(time > M) return;

        if(depth == N){
            max = Math.max(max, sum);
            return;
        }
            DFS(sum+arr[depth][0],depth+1,time+arr[depth][1]);
            DFS(sum,depth+1,time);

    }
}
