package DFS_BFS;

import java.util.LinkedList;

public class 네트워크2 {
    public static void main(String[] args) {
        int n = 3;
        int[][] computers = {
                {1, 1, 0}, {1, 1, 0}, {0, 0, 1}
        };

        solution(n, computers);

    }

    static LinkedList<LinkedList<Integer>> list;
    private static int solution(int n, int[][] computers) {
         list = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            list.add(new LinkedList<>());
        }

        for (int i = 0; i < computers.length; i++) {
            for (int j = 0; j < computers.length; j++) {
                if(i==j) continue;
                int val = computers[i][j];
                if (val == 1) {
                    list.get(i).add(j);
                }
            }
        }

        visited = new boolean[n];
        int answer = 0;
        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                visited[i] = true;
                dfs(i);
                answer++;
            }
        }

        System.out.println("answer = " + answer);
        return answer;
    }
    static boolean[] visited;
    private static void dfs(int i) {

        for (int j = 0; j < list.get(i).size(); j++) {
            Integer n = list.get(i).get(j);
            if (!visited[n]) {
                visited[n] = true;
                dfs(n);
            }

        }
    }

}
