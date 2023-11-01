package 실버2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class _종이의_개수 {
    static int[][] paper;
    static int[] count = new int[3]; // 0, 1, -1의 개수를 저장하는 배열

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        paper = new int[n][n];

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                paper[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        divide(0, 0, n);

        for (int i = 0; i < 3; i++) {
            System.out.println(count[i]);
        }
    }

    static boolean isSame(int x, int y, int size) {
        int val = paper[x][y];
        for (int i = x; i < x + size; i++) {
            for (int j = y; j < y + size; j++) {
                if (paper[i][j] != val) {
                    return false;
                }
            }
        }
        return true;
    }

    static void divide(int x, int y, int size) {
        if (isSame(x, y, size)) {
            count[paper[x][y] + 1]++;
        } else {
            int newSize = size / 3;
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    divide(x + i * newSize, y + j * newSize, newSize);
                }
            }
        }
    }
}
