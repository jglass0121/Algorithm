import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 토마토 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int N = sc.nextInt();
        int[][] arr = new int[N][M];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        bfs(M, N,  arr);
    }

    static int[] dx = {1, -1, 0, 0};
    static int[] dy = {0, 0, 1, -1};

    private static void bfs(int m, int n, int[][] arr) {
        Queue<int[]> queue = new LinkedList<>();

        // 1️⃣ 익은 토마토 전부 큐에 넣기
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (arr[i][j] == 1) {
                    queue.add(new int[]{i, j});
                }
            }
        }

        // 2️⃣ BFS
        while (!queue.isEmpty()) {
            int[] poll = queue.poll();
            int nowX = poll[0];
            int nowY = poll[1];

            for (int i = 0; i < 4; i++) {
                int nx = nowX + dx[i];
                int ny = nowY + dy[i];

                // ✅ 범위 체크 수정
                if (nx < 0 || ny < 0 || nx >= n || ny >= m) continue;

                if (arr[nx][ny] == 0) {
                    // ✅ 날짜 저장
                    arr[nx][ny] = arr[nowX][nowY] + 1;
                    queue.add(new int[]{nx, ny});
                }
            }
        }

        // 3️⃣ 결과 계산
        int answer = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (arr[i][j] == 0) {
                    System.out.println(-1);
                    return;
                }
                answer = Math.max(answer, arr[i][j]);
            }
        }

        System.out.println(answer - 1);
    }
}
