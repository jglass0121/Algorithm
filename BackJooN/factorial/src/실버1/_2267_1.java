package 실버1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class _2267_1 {
    static int[][] map;
    static int n;
    static int[] dx = {1, -1, 0, 0};
    static int[] dy = {0, 0, 1, -1};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        sc.nextLine();  // 개행 문자 처리

        map = new int[n][n];
        for (int i = 0; i < n; i++) {
            String line = sc.nextLine();
            for (int j = 0; j < n; j++) {
                map[i][j] = line.charAt(j) - '0';
            }
        }

        ArrayList<Integer> complexSizes = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (map[i][j] == 1) {
                    int complexSize = dfs(i, j);
                    complexSizes.add(complexSize);
                }
            }
        }

        // 결과 출력
        Collections.sort(complexSizes);
        System.out.println(complexSizes.size());
        for (int size : complexSizes) {
            System.out.println(size);
        }
    }

    static int dfs(int x, int y) {
        map[x][y] = 0;  // 방문 처리

        int complexSize = 1;

        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if (nx >= 0 && ny >= 0 && nx < n && ny < n && map[nx][ny] == 1) {
                complexSize += dfs(nx, ny);
            }
        }

        return complexSize;
    }
}
