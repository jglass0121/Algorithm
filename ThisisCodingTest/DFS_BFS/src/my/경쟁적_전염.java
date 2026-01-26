package my;

import java.util.PriorityQueue;
import java.util.Scanner;

public class 경쟁적_전염 {

    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, -1, 0, 1};

    static class Virus implements Comparable<Virus> {
        int time;
        int num;
        int x;
        int y;

        Virus(int time, int num, int x, int y) {
            this.time = time;
            this.num = num;
            this.x = x;
            this.y = y;
        }

        @Override
        public int compareTo(Virus o) {
            if (this.time != o.time) return this.time - o.time;
            return this.num - o.num;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();

        int[][] arr = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int s = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();

        System.out.println(bfs(arr, s, x, y, N));
    }

    private static int bfs(int[][] arr, int s, int x, int y, int N) {

        PriorityQueue<Virus> pq = new PriorityQueue<>();

        // 초기 바이러스 삽입
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (arr[i][j] != 0) {
                    pq.add(new Virus(0, arr[i][j], i, j));
                }
            }
        }

        while (!pq.isEmpty()) {
            Virus now = pq.poll();

            // s초가 되면 종료
            if (now.time == s) break;

            for (int d = 0; d < 4; d++) {
                int nx = now.x + dx[d];
                int ny = now.y + dy[d];

                if (nx < 0 || ny < 0 || nx >= N || ny >= N) continue;
                if (arr[nx][ny] != 0) continue;

                arr[nx][ny] = now.num;
                pq.add(new Virus(now.time + 1, now.num, nx, ny));
            }
        }

        return arr[x - 1][y - 1];
    }
}
