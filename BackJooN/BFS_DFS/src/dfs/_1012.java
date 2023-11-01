package dfs;

import javax.swing.*;
import java.util.Scanner;

public class _1012 {
    static int[] x = {1, 0, -1, 0};
    static int[] y = {0, 1, 0, -1};
    static int[][] arr;
    static int N;
    static int M;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();


        for (int i = 0; i < num; i++) {
             M = sc.nextInt(); //가로
             N = sc.nextInt(); // 세로
             arr = new int[M][N];
            int position = sc.nextInt();
            sc.nextLine();

            for (int j = 0; j < position; j++) {
                int x = sc.nextInt();
                int y = sc.nextInt();
                sc.nextLine();
                arr[x][y] = 1;
            }

            int result = 0;
            for (int j = 0; j < M; j++) {
                for (int k = 0; k < N; k++) {
                    if (arr[j][k] == 1) {
                        fac(j, k);
                        result++;
                    }

                }
            }
            System.out.println(result);


        }
    }

    private static void fac(int startX, int startY) {
        if (startX < 0 || startY < 0 || startX >= M || startY >= N) {
            return;
        }
        if (arr[startX][startY] == 0) {
            return;
        }

        arr[startX][startY] = 0;
        for (int i = 0; i < 4; i++) {
            int nextX = startX + x[i];
            int nextY = startY + y[i];
            fac(nextX, nextY);
        }

    }
}
