package DFS_BFS;

import java.util.LinkedList;
import java.util.Queue;

public class 가장먼노드 {
    public static void main(String[] args) {
        int n = 6;
        int[][] vertex = {
                {3, 6}, {4, 3}, {3, 2}, {1, 3}, {1, 2}, {2, 4}, {5, 2}
        };

        solution(n, vertex);
    }

    private static int solution(int n, int[][] vertex) {

        LinkedList<LinkedList<Integer>> list = new LinkedList<LinkedList<Integer>>();
        for (int i = 1; i <= n+1; i++) {
            list.add(new LinkedList<>());
        }

        for (int i = 0; i < vertex.length; i++) {
            int from = vertex[i][0];
            int end = vertex[i][1];
            list.get(from).add(end);
            list.get(end).add(from);
        }


        //bfs
        return bfs(list, n);
    }

    static boolean[] visited;

    private static int bfs(LinkedList<LinkedList<Integer>> list, int n) {
        visited = new boolean[n + 1];
        Queue<int[]> queue = new LinkedList<>();

        int[] dist = new int[n + 1]; // 각 노드의 길이 구하기
        visited[1] = true;
        queue.add(new int[]{1, 0});

        while (!queue.isEmpty()) {
            int[] now = queue.poll();


            // 최대 길이 구하기
            dist[now[0]] = now[1];

            for (Integer next : list.get(now[0])) {
                if (!visited[next]) {
                    visited[next] = true;
                    queue.add(new int[]{next, now[1] + 1});
                }
            }

        }

        // 최대 길이 구하기
        int max = -1;
        for (int i = 0; i < dist.length; i++) {
            max = Math.max(max, dist[i]);
        }

        // 개수 구하기
        int cnt = 0;
        for (int i = 0; i < dist.length; i++) {
            if (max == dist[i]) {
                cnt++;
            }
        }

        return cnt;
    }

}
