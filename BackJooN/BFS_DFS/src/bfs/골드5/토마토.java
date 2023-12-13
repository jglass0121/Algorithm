package bfs.골드5;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 토마토 {
    static int M, N, H;
    static int[][][] box;
    static boolean[][][] visited;
    static int[] dh = {0, 0, 0, 0, 1, -1};
    static int[] dy = {0, 0, 1, -1, 0, 0};
    static int[] dx = {1, -1, 0, 0, 0, 0};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        M = sc.nextInt();
        N = sc.nextInt();
        H = sc.nextInt();

        box = new int[H][N][M];
        visited = new boolean[H][N][M];

        for (int k = 0; k < H; k++) {
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < M; j++) {
                    box[k][i][j] = sc.nextInt();
                }
            }
        }

        int days = bfs();

        if (checkAllTomatoes()) {
            System.out.println(days);
        } else {
            System.out.println("-1");
        }
    }

    private static int bfs() {
        Queue<Tomato> queue = new LinkedList<>();

        // 익은 토마토를 큐에 추가
        for (int k = 0; k < H; k++) {
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < M; j++) {
                    if (box[k][i][j] == 1) {
                        queue.add(new Tomato(k, i, j, 0));
                        visited[k][i][j] = true;
                    }
                }
            }
        }

        int days = 0;

        while (!queue.isEmpty()) {
            Tomato tomato = queue.poll();
            days = tomato.days;

            for (int d = 0; d < 6; d++) {
                int nh = tomato.h + dh[d];
                int ni = tomato.i + dy[d];
                int nj = tomato.j + dx[d];

                if (isValid(nh, ni, nj) && !visited[nh][ni][nj] && box[nh][ni][nj] == 0) {
                    visited[nh][ni][nj] = true;
                    box[nh][ni][nj] = 1;
                    queue.add(new Tomato(nh, ni, nj, tomato.days + 1));
                }
            }
        }

        return days;
    }

    private static boolean isValid(int h, int i, int j) {
        return h >= 0 && h < H && i >= 0 && i < N && j >= 0 && j < M;
    }

    private static boolean checkAllTomatoes() {
        for (int k = 0; k < H; k++) {
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < M; j++) {
                    if (box[k][i][j] == 0) {
                        return false; // 아직 익지 않은 토마토가 있으면 false 반환
                    }
                }
            }
        }
        return true; // 모든 토마토가 익었으면 true 반환
    }

    static class Tomato {
        int h, i, j, days;

        public Tomato(int h, int i, int j, int days) {
            this.h = h;
            this.i = i;
            this.j = j;
            this.days = days;
        }
    }
}
