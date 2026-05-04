import java.util.*;
class Solution {
    static LinkedList<LinkedList<Integer>> list;
    static boolean[] visited;
    private static void DFS(int x) {
        visited[x] = true;
        for (int j = 0; j < list.get(x).size(); j++) {
            Integer next = list.get(x).get(j);
            if (!visited[next]) {
                visited[next] =true;
                DFS(next);
            }
        }
    }
    public int solution(int n, int[][] computers) {
       
        list = new LinkedList<>();
        visited = new boolean[n];
        for (int i = 0; i < n; i++) {
            list.add(new LinkedList<Integer>());
        }

        for (int i = 0; i < computers.length; i++) {
            for (int j = 0; j < computers.length; j++) {
                if (computers[i][j] == 1) {
                    list.get(i).add(j);
                }
            }
        }

        //dfs
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                DFS(i);
                cnt++;
            }
        }
        
        return cnt;
    }
}