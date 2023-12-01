package L2;

import java.util.Arrays;

public class _2 {
    static int[][] graph;
    static boolean[] visited;
    static int[] checkpoints;
    static int minIntensity;

    public int solution(int n, int[][] paths) {
        graph = new int[n + 1][n + 1];
        visited = new boolean[n + 1];
        checkpoints = new int[n + 1];
        minIntensity = Integer.MAX_VALUE;

        for (int[] path : paths) {
            graph[path[0]][path[1]] = path[2];
            graph[path[1]][path[0]] = path[2];
        }

        for (int start = 1; start <= n; start++) {
            Arrays.fill(visited, false);
            dfs(start, start, 0, 0);
        }

        return minIntensity;
    }

    private void dfs(int start, int current, int intensity, int visitedCount) {
        visited[current] = true;

        // 현재 지점이 출발지이면서 모든 산봉우리를 방문했을 때
        if (current == start && visitedCount == checkpoints.length) {
            minIntensity = Math.min(minIntensity, intensity);
            visited[current] = false;
            return;
        }

        for (int next = 1; next < graph[current].length; next++) {
            if (!visited[next] && graph[current][next] > 0) {
                int nextIntensity = Math.max(intensity, graph[current][next]);
                int nextVisitedCount = visitedCount;

                if (checkpoints[next] == 1) {
                    nextVisitedCount++;
                }

                dfs(start, next, nextIntensity, nextVisitedCount);
            }
        }

        visited[current] = false;
    }

    public static void main(String[] args) {
        _2 solution = new _2();
        int n = 5;
        int[][] paths = {
                {1, 2, 3}, {2, 3, 5}, {2, 4, 2}, {2, 5, 4},
                {3, 4, 4}, {4, 5, 3}, {4, 1, 1}, {5, 1, 2}
        };
        int result = solution.solution(n, paths);
        System.out.println(result); // 출력: 4
    }
}
