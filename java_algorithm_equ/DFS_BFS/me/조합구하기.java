package me;

import java.util.Scanner;

public class 조합구하기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        ch = new int[M];
        fac(0, 1);

    }

    static int[] ch;
    static int N;
    static int M;

    private static void fac(int depth, int s) {

        if (depth == M) {
            for (int i = 0; i < ch.length; i++) {
                System.out.print (ch[i]);
            }
            return;
        }

        for (int i = s; i <= N; i++) {
            ch[depth] =i;
            fac(depth+1,i+1);
        }
        
    }

}

