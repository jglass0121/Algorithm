package me.ex2;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Scanner;

public class 원더랜드 {
    static class City {
        int end;
        int cost;

        public City(int end, int cost) {
            this.end = end;
            this.cost = cost;
        }

        @Override
        public String toString() {
            return "City{" +
                    "end=" + end +
                    ", cost=" + cost +
                    '}';
        }
    }


    static int V;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        V = sc.nextInt();
        int E = sc.nextInt();

        LinkedList<LinkedList<City>> list = new LinkedList<>();
        visited = new boolean[V + 1];

        // 0번 인덱스까지 포함해서 만들어야 list.get(1)부터 안전하게 사용 가능
        for (int i = 0; i <= V; i++) {
            list.add(new LinkedList<>());
        }

        for (int i = 0; i < E; i++) {
            int st = sc.nextInt();
            int ed = sc.nextInt();
            int cost = sc.nextInt();

            // 양방향 그래프
            list.get(st).add(new City(ed, cost));
            list.get(ed).add(new City(st, cost));

        }

        bfs(list);



    }

    static boolean[] visited;

    private static void bfs(LinkedList<LinkedList<City>> list) {
        PriorityQueue<City> queue = new PriorityQueue<City>((a, b) -> {
            return a.cost - b.cost;
        });


        queue.add(new City(1, 0));

        int sum = 0;

        while (!queue.isEmpty()) {
            City now = queue.poll();
            if (visited[now.end]) {
                continue;
            }
            visited[now.end] = true;
            sum += now.cost;
            
            LinkedList<City> cities = list.get(now.end); // 하위
            for (City next : cities) {
                if (!visited[next.end]) {
                    queue.add(next);
                }
            }

        }


        System.out.println(sum);
    }
}
