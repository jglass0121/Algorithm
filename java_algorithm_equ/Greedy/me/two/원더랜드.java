package me.two;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class 원더랜드 {
    static class Node{
        int v;
        int dis;

        public Node(int v, int dis) {
            this.v = v;
            this.dis = dis;
        }
    }

    static boolean[] visited;
    static ArrayList<Node>[] graph;
    static int[] dist;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int V = Integer.parseInt(st.nextToken());
        int E = Integer.parseInt(st.nextToken());

        visited = new boolean[V + 1];
        dist = new int[V + 1];
        graph = new ArrayList[V + 1];

        for (int i = 1; i <= V; i++) {
            graph[i] = new ArrayList<>();
            dist[i] = Integer.MAX_VALUE;
        }

        for (int i = 0; i < E; i++) {
            st = new StringTokenizer(br.readLine());
            int inputU = Integer.parseInt(st.nextToken());
            int inputV = Integer.parseInt(st.nextToken());
            int inputW = Integer.parseInt(st.nextToken());

            graph[inputU].add(new Node(inputV, inputW));
            graph[inputV].add(new Node(inputU, inputW));
        }

        int dijkstra = dijkstra();
        System.out.println("dijkstra = " + dijkstra);


    }

    private static int dijkstra() {
        PriorityQueue<Node> q = new PriorityQueue<>((o1, o2) ->  o1.dis-o2.dis);
        q.add(new Node(1, 0));
        dist[1] = 0;

        int answer = 0;
        while (!q.isEmpty()) {
            Node now = q.poll();

            if(visited[now.v]) continue;
            visited[now.v] = true;

            answer += now.dis;

            for (Node next : graph[now.v]) {
                if (!visited[next.v]) {
                    q.add(next);
                }
            }
        }

        return answer;

    }
}
