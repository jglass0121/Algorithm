package dfs_bfs;

import java.util.Arrays;
import java.util.LinkedList;

public class _네트워크 {
    public static void main(String[] args) {
        int n = 3;
        int[][] computers = {
                {1, 1, 0}, {1, 1, 0}, {0, 0, 1}
        };
        int solution = solution(n, computers);
        System.out.println("solution = " + solution);
    }

    static LinkedList<LinkedList<Integer>> list = new LinkedList<>();
    static boolean[] visited ;
    private static int solution(int n, int[][] computers) {
        visited = new boolean[n+1];
        for (int i = 0; i < n+1; i++) {
            list.add(new LinkedList<Integer>());
        }

        for (int i = 0; i < computers.length; i++) {
            for (int j = 0; j < computers[i].length; j++) {
                if(i==j) continue;
                if(computers[i][j] == 1){
                    list.get(i).add(j);
                }
            }
        }

        int cnt = 0;
        for (int i = 0; i <n; i++) {
            if (!visited[i]) {
                dfs(i);
                cnt += 1;
            }
        }

        return cnt;


    }

    private static void dfs(int start) {

        visited[start] = true;
        for (int i = 0; i < list.get(start).size(); i++) {
            Integer next = list.get(start).get(i);
            if (!visited[next]) {
                dfs(next);
            }
        }
    }
}
