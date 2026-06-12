package DFS_BFS;

import java.util.LinkedList;
import java.util.Queue;

public class 네트워크2 {
    public static void main(String[] args) {
        int n = 3;
        int[][] computers = {
                {1, 1, 0}, {1, 1, 0}, {0, 0, 1}
        };

        System.out.println(solution(n, computers));

    }

    static boolean[] visited;
    private static int solution(int n, int[][] computers) {

        visited = new boolean[n];
        int cnt = 0;

        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                bfs(i, n, computers);
                cnt++;
            }
        }

        return cnt;



    }

    private static void bfs(int start, int n, int[][] computers) {

        Queue<Integer> queue = new LinkedList<>();
        queue.add(start);
        visited[start] = true;

        while (!queue.isEmpty()) {
            int now = queue.poll();

            for (int next = 0; next < n; next++) {
                if (computers[now][next] == 1 && !visited[next]) {
                    visited[next] = true;
                    queue.add(next);
                }
            }
        }
    }
}
