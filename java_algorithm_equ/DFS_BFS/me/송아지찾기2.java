package me;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 송아지찾기2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int e = sc.nextInt();

        System.out.println(solution(s, e));

    }

    static boolean[] visited;
    static int[] dis = {-1, 1, 5};

    private static int solution(int s, int e) {
        Queue<Integer> queue = new LinkedList<>();
        visited = new boolean[10001];
        visited[s] = true;
        queue.add(s);
        int depth = 0;
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                Integer poll = queue.poll();
                for (int j = 0; j < dis.length; j++) {
                    int nx = poll + dis[j];
                    if (nx == e) return depth + 1;
                    if (nx >= 0 && nx <= 10000 && !visited[nx]) {
                        visited[nx] = true;
                        queue.add(nx);
                    }
                }
            }

            depth++;
        }

        return depth;
    }
}
