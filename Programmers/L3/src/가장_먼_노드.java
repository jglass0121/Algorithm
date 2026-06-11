import java.util.*;

public class 가장_먼_노드 {
    public static void main(String[] args) {
        int n = 6;
        int[][] vertex = {
                {3, 6}, {4, 3}, {3, 2}, {1, 3}, {1, 2}, {2, 4}, {5, 2}
        };
        // 최대 길이란 ? 몇개 ?
        //pq : depth

        solution(n, vertex);
    }

    static boolean[] visited;
    private static int solution(int n, int[][] vertex) {
        // 1. 그래프 생성
        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<>());
        }

        // 2. 양방향 그래프
        for (int i = 0; i < vertex.length; i++) {
            int from = vertex[i][0];
            int to = vertex[i][1];

            graph.get(from).add(to);
            graph.get(to).add(from);
        }

        // 3. BFS 준비
        visited = new boolean[n + 1];
        int[] dist = new int[n + 1];

        Queue<Integer> q = new LinkedList<>();

        q.add(1);
        visited[1] = true;

        // 4. BFS
        while (!q.isEmpty()) {
            int now = q.poll();

            for (int next : graph.get(now)) {
                if (!visited[next]) {
                    visited[next] = true;
                    dist[next] = dist[now] + 1;
                    q.add(next);
                }
            }
        }

        // 5. 최대 거리 찾기
        int max = 0;
        for (int i = 1; i <= n; i++) {
            max = Math.max(max, dist[i]);
        }

        // 6. 개수 세기
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (dist[i] == max) count++;
        }

        return count;

    }
}
