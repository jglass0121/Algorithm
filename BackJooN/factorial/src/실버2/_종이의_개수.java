package 실버2;

import java.util.Scanner;

public class _종이의_개수 {
    static int[][] arr;
    static int[] res = new int[3];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        arr = new int[num][num];
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                arr[i][j] = sc.nextInt();
            }

        }

        solve(0, 0, num);

    }

    private static void solve(int r, int c, int size) {
        if (check(r, c, size)) {
            int num = arr[r][c];
            if (num == 0) {
                res[1]++;
            } else if (num == 1) {
                res[2]++;
            } else {
                res[0]++;
            }
            return;
        }


        int newSize = size / 3;
        for (int i = r; i < r + size; i += newSize) {
            for (int j = c; j < c + size; j += newSize) {
                solve(i, j, newSize);
            }

        }


    }

    private static boolean check(int r, int c, int size) {
        for (int i = r; i < r + size; i++) {
            for (int j = c; j < c + size; j++) {
                if (arr[r][c] != arr[i][j]) {
                    return false;
                }
            }
        }
            return true;
    }
}
