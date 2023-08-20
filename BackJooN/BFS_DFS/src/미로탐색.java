import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 미로탐색 {
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    static int n;
    static int m;
    //static int[][] map;
    public static int[][] map;

    static boolean[][] visited;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        sc.nextLine();

        map = new int[n][m];
        visited = new boolean[n][m];

        for (int i = 0; i < n; i++) {
            String s = sc.nextLine();
            for (int j = 0; j < m; j++) {
                map[i][j] = s.charAt(j) - '0';
                if (map[i][j] == 1) {
                    visited[i][j] = false;
                } else {
                    visited[i][j] = true;
                }

            }
        }

        visited[0][0] = true;


        System.out.println(bfs(0, 0));


    }

    private static int  bfs(int x, int y) {
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{x, y});
        while (!q.isEmpty()) {
            int now[] = q.poll();
            int nowX = now[0];
            int nowY = now[1];
            for (int i = 0; i < 4; i++) {

                int nextX = nowX + dx[i];
                int nextY = nowY + dy[i];

                if (nextX < 0 || nextX >= n || nextY < 0 || nextY >= m) {
                    continue;
                }

                if (map[nextX][nextY] == 0) {
                    continue;
                }
                if (map[nextX][nextY] == 1) {
                    map[nextX][nextY] = map[nowX][nowY] + 1;
                    visited[nowX][nowY] = true;
                    if (!visited[nextX][nextY]) {
                        q.add(new int[]{nextX, nextY});
                    }


                }
            }

        }
        return map[n-1][m-1];
    }
}
