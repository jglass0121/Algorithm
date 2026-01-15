package me;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 미로의_최단거리_통록 {
    static boolean[][] visited;
    static int[][] arr;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = 7;
        arr = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        visited = new boolean[7][7];
        bfs(0, 0);
    }

    static int[] dx = {0, 1, 0, -1};
    static int[] dy = {-1, 0, 1, 0};


    private static void bfs(int x, int y) {
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{x, y, 0});
        visited[x][y] = true;

        while (!queue.isEmpty()) {

            int[] now = queue.poll();
            for (int i = 0; i < 4; i++) {
                int nx = now[0] + dx[i];
                int ny = now[1] + dy[i];

                //nx
                if (nx < 0 || ny < 0 || nx >= 7 || ny >= 7 || arr[nx][ny] ==1 ) {
                    continue;
                }
                if (nx == 6 && ny == 6) {
                    System.out.println(now[2]+1);
                    return;
                }
                if (!visited[nx][ny] ) {
                    visited[nx][ny] = true;
                    queue.add(new int[]{nx, ny,now[2]+1});
                }
            }
        }

        System.out.println(-1);

    }
}
