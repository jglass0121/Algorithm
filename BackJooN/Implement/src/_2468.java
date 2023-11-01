import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class _2468 {
    static int[][] arr;
    static boolean[][] visited;
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};
    static int n;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        sc.nextLine();
        arr = new int[n][n];
        visited = new boolean[n][n];
        int maxH = 0;  // 가장 높은 지형 높이

        for (int i = 0; i < n; i++) {
            String[] str = sc.nextLine().split(" ");
            for (int j = 0; j < n; j++) {
                arr[i][j] = Integer.parseInt(str[j]);
                maxH = Math.max(maxH, arr[i][j]);
            }
        }

        int maxSafeArea = 0;  // 가장 많은 안전 지역 수

        for (int h = 0; h <= maxH; h++) {
            int safeArea = 0;  // 현재 높이에서의 안전 지역 수

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (arr[i][j] <= h) {
                        visited[i][j] = true;
                    } else {
                        visited[i][j] = false;
                    }
                }
            }

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (!visited[i][j]) {
                        bfs(i, j, h);
                        safeArea++;
                    }
                }
            }

            maxSafeArea = Math.max(maxSafeArea, safeArea);
        }

        System.out.println(maxSafeArea);
    }

    private static void bfs(int x, int y, int h) {
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{x, y});
        visited[x][y] = true;

        while (!queue.isEmpty()) {
            int[] pos = queue.poll();
            for (int i = 0; i < 4; i++) {
                int nx = pos[0] + dx[i];
                int ny = pos[1] + dy[i];
                if (nx >= 0 && ny >= 0 && nx < n && ny < n && !visited[nx][ny] && arr[nx][ny] > h) {
                    queue.add(new int[]{nx, ny});
                    visited[nx][ny] = true;
                }
            }
        }
    }
}
