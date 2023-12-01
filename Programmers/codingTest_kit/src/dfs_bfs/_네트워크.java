package dfs_bfs;

import java.util.LinkedList;

public class _네트워크{


    public static void main(String[] args) {
        int n = 3;
        int[][] computers = {
                {1, 1, 0}, {1, 1, 1}, {0, 1, 1}
        };

        solution(n, computers);
    }

    private static void solution(int n, int[][] computers) {
        LinkedList<LinkedList<Integer>> list = new LinkedList<>();
        for (int i = 0; i < n + 1; i++) {
            list.add(new LinkedList<>());
        }
        boolean[] visited = new boolean[n + 1];
        for (int i = 0; i < computers.length; i++) {
            for (int j = 0; j < computers.length; j++) {
                if(i==j) continue;
                if (computers[i][j] == 1) {
                    list.get(i + 1).add(j + 1);
                }
            }
        }
        int cnt = 0;
        for (int i = 1; i <= n; i++) {

            if (!visited[i]) {
                dfs(visited, list,i);
                cnt += 1;
            }
        }
        System.out.println(cnt);




    }

    private static void dfs(boolean[] visited, LinkedList<LinkedList<Integer>> list, int i) {
        visited[i] = true;

        for (int j = 0; j < list.get(i).size(); j++) {
            Integer next = list.get(i).get(j);
            if (!visited[next]) {
                dfs(visited, list, next);
            }

        }


    }

}
