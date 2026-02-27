package me.two;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 송아지_찾기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int S = sc.nextInt();
        int E = sc.nextInt();
        int bfs = BFS(S, E);
        System.out.println(bfs);

    }

    static int[] dis = {1, -1, 5};
    static boolean[] visited;

    private static int BFS(int s, int e) {
        if(s == e) return 0;
        Queue<int[]> queue = new LinkedList<>();
        visited = new boolean[10001];
        visited[s] = true;
        queue.add(new int[]{s,0});
        while (!queue.isEmpty()) {
            int[] poll = queue.poll();
            int now = poll[0];
            int cnt = poll[1];

            for (int i = 0; i < dis.length; i++) {
                int next = now + dis[i];
                if(next == e) {
                    return cnt+1;
                }
                if(next >= 0 && next <= 10000 && !visited[next]){

                    visited[next] = true;
                    queue.add(new int[]{next, cnt + 1});
                }
            }
        }

        return -1;
    }

}
