package dfs_bfs;

import java.util.LinkedList;

public class 전력망을_돌로_나누기 {
    public static void main(String[] args) {
        int n = 9;
        int[][] wires = {{1, 3}, {2, 3}, {3, 4}, {4, 5}, {4, 6}, {4, 7}, {7, 8}, {7, 9}};
        solution(n, wires);

    }

    static boolean visited[];
    static LinkedList<LinkedList<Integer>> list;

    static int cnt = 0;
    private static int solution(int n, int[][] wires) {
        list = new LinkedList<>();
        for (int i = 0; i < n+1; i++) {
            list.add(new LinkedList<Integer>());
        }

        for (int[] wire : wires) {
            list.get(wire[0]).add(wire[1]);
            list.get(wire[1]).add(wire[0]);
        }

        visited = new boolean[n + 1];
        int res = Integer.MAX_VALUE;
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < list.get(i).size(); j++) {
                Integer next = list.get(i).get(j);
                cnt = 0;
                int nowNode = dfs(i, next);
                cnt = 0;
                int childNode= dfs(next, i);
                res = Math.min(Math.abs(nowNode - childNode),res);

            }


        }
        return res;
    }


    private static int dfs(int i,  Integer next) {
        visited[i] = true;
        cnt++;

        for (int j = 0; j < list.get(i).size(); j++) {
            Integer childNode = list.get(i).get(j);
            if(childNode==next)continue;
            if (!visited[childNode]) {
                dfs(childNode,  next);
            }

        }
        visited[i] = false;


        return cnt;
    }
}
