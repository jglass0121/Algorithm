package _backTracking.골드4;

import java.util.Scanner;

public class N_Queen {
    static int[] arr;
    static int N;
    static int cnt = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         N = sc.nextInt();
        arr = new int[N];
        nQueen(0);

    }

    private static void nQueen(int depth) {
        if (depth == N) {
            cnt++;
            return;
        }

        for (int i = 0; i < N; i++) {
            arr[depth] = i;
            if (pos(depth)) {
                nQueen(depth + 1);
            }
        }

    }

    private static boolean pos(int col) {
        for (int i = 0; i < col; i++) {
            //같은 행 존재 
            if (arr[col] == arr[i]) {
                return false;
                //대각선
            } else if (Math.abs(col - i) == Math.abs(arr[col] - arr[i])) {
                return false;
            }
        }
        return true;
        
    }
}
