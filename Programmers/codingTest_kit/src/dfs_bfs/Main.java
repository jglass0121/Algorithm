package dfs_bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static int N, K, S, X, Y;
    static int[][] map;
    static int[] dx = {-1, 1, 0, 0}; // 상, 하, 좌, 우
    static int[] dy = {0, 0, -1, 1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        map = new int[N][N];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        st = new StringTokenizer(br.readLine());
        S = Integer.parseInt(st.nextToken());
        X = Integer.parseInt(st.nextToken()) - 1;
        Y = Integer.parseInt(st.nextToken()) - 1;

        solve();

        System.out.println(map[X][Y]);
    }

    static void solve() {
        Queue<Virus> queue = new ArrayDeque<>();

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (map[i][j] != 0) {
                    queue.offer(new Virus(i, j, map[i][j], 0));
                }
            }
        }

        while (!queue.isEmpty()) {
            Virus current = queue.poll();

            if (current.time == S) break;

            for (int d = 0; d < 4; d++) {
                int nx = current.x + dx[d];
                int ny = current.y + dy[d];

                if (nx >= 0 && nx < N && ny >= 0 && ny < N && map[nx][ny] == 0) {
                    map[nx][ny] = current.type;
                    queue.offer(new Virus(nx, ny, current.type, current.time + 1));
                }
            }
        }
    }

    static class Virus {
        int x, y, type, time;

        public Virus(int x, int y, int type, int time) {
            this.x = x;
            this.y = y;
            this.type = type;
            this.time = time;
        }
    }
}
