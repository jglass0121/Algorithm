package DFS_BFS;

import java.util.LinkedList;
import java.util.Queue;

public class 리코쳇_로봇 {
    public static void main(String[] args) {
        String[] board = {".D.R", "....", ".G..", "...D"};
        int solution = solution(board);
        System.out.println("solution = " + solution); // 예상 출력: 7
    }

    private static int solution(String[] board) {
        int n = board.length;
        int m = board[0].length();
        String[][] arr = new String[n][m];

        int sx = 0, sy = 0, ex = 0, ey = 0;

        for (int i = 0; i < n; i++) {
            String[] split = board[i].split("");
            for (int j = 0; j < m; j++) {
                arr[i][j] = split[j];
                if (arr[i][j].equals("R")) {
                    sx = i;
                    sy = j;
                }
                if (arr[i][j].equals("G")) {
                    ex = i;
                    ey = j;
                }
            }
        }

        return bfs(arr, sx, sy, ex, ey);
    }

    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, -1, 0, 1};

    private static int bfs(String[][] arr, int sx, int sy, int ex, int ey) {
        int n = arr.length;
        int m = arr[0].length;

        // 큐에는 {x좌표, y좌표, 현재까지의 이동 횟수}를 배열 형태로 넣습니다.
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{sx, sy, 0});

        boolean[][] visited = new boolean[n][m];
        visited[sx][sy] = true;

        while (!queue.isEmpty()) {
            int[] now = queue.poll();
            int x = now[0];
            int y = now[1];
            int count = now[2];

            // 큐에서 꺼낸 현재 위치가 목표 지점(G)이라면 현재까지의 이동 횟수 반환
            if (x == ex && y == ey) {
                return count;
            }

            // 4방향으로 탐색
            for (int i = 0; i < 4; i++) {
                int nx = x;
                int ny = y;

                // 장애물이나 보드 끝을 만날 때까지 계속 직진 (미끄러짐)
                while (true) {
                    int nextX = nx + dx[i];
                    int nextY = ny + dy[i];

                    // 다음 칸이 보드 밖이거나 'D'라면 더 갈 수 없으므로 루프 종료
                    if (nextX < 0 || nextY < 0 || nextX >= n || nextY >= m || arr[nextX][nextY].equals("D")) {
                        break;
                    }

                    // 갈 수 있는 길이라면 현재 좌표를 갱신
                    nx = nextX;
                    ny = nextY;
                }

                // 멈춘 최종 위치가 방문한 적 없는 곳이라면 큐에 추가
                if (!visited[nx][ny]) {
                    visited[nx][ny] = true;
                    // 한 번 미끄러졌으므로 이동 횟수를 +1 해서 큐에 넣음
                    queue.add(new int[]{nx, ny, count + 1});
                }
            }
        }

        // 큐가 빌 때까지 G에 도달하지 못했다면 도달 불가능하므로 -1 반환
        return -1;
    }
}