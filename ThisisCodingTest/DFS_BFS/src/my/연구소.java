package my;

import java.util.Scanner;

public class 연구소 {

    static int N, M;
    static int answer = 0;

    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, -1, 0, 1};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        M = sc.nextInt();

        int[][] arr = new int[N][M];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        back(arr, 0);

        System.out.println(answer);
    }

    // 벽 3개 세우기
    private static void back(int[][] arr, int cnt) {
        if (cnt == 3) {
            // 🔥 반드시 복사
            int[][] copy = new int[N][M];
            for (int i = 0; i < N; i++) {
                copy[i] = arr[i].clone();
            }

            // 바이러스 퍼뜨리기
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < M; j++) {
                    if (copy[i][j] == 2) {
                        dfs(i, j, copy); // ⭐ 여기 중요
                    }
                }
            }

            // 안전 영역 계산
            int safe = 0;
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < M; j++) {
                    if (copy[i][j] == 0) safe++;
                }
            }

            answer = Math.max(answer, safe);
            return;
        }

        // 벽 세우기
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (arr[i][j] == 0) {
                    arr[i][j] = 1;
                    back(arr, cnt + 1);
                    arr[i][j] = 0;
                }
            }
        }
    }

    // 바이러스 퍼뜨리기
    private static void dfs(int x, int y, int[][] arr) {
        for (int d = 0; d < 4; d++) {
            int nx = x + dx[d];
            int ny = y + dy[d];

            if (nx < 0 || ny < 0 || nx >= N || ny >= M) continue;
            if (arr[nx][ny] == 0) {
                arr[nx][ny] = 2;
                dfs(nx, ny, arr);
            }
        }
    }
}
