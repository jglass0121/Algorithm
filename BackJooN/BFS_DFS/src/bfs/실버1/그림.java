package bfs.실버1;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
public class 그림 {
    static int[] dy = {1, 0, -1, 0};
    static int[] dx = {0, 1, 0, -1};

    static int n;
    static int m;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         n = sc.nextInt();
         m = sc.nextInt();

        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int cnt = 0;
        int width = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (arr[i][j] == 1) {
                    width = Math.max(bfs(arr, i, j), width);
                    cnt++;
                }

            }
        }

        System.out.println(cnt);
        System.out.println(width);
    }

    private static int bfs(int[][] arr,int startY, int startX) {
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{ startY,startX});
        arr[startY][startX] = 0;
        int width = 1;

        while (!queue.isEmpty()) {
            int[] now = queue.poll();
            for (int i = 0; i < 4; i++) {
                int ny = now[0] + dy[i];
                int nx = now[1] + dx[i];

                if (ny < 0 || ny >= n || nx < 0 || nx >= m) {
                    continue;
                }


                if (arr[ny][nx]==1) {
                    width++;
                    queue.add(new int[]{ny, nx});
                    arr[ny][nx] = 0;
                }

            }


        }

        return width;
    }

}
