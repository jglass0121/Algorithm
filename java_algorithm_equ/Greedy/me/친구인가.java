package me;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

//다중 리스트이용하여 문제 해결
public class 친구인가 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        sc.nextLine();
        LinkedList<LinkedList<Integer>> list = new LinkedList<>();
        for (int i = 1; i <= N+1; i++) {
            list.add(new LinkedList<Integer>());
        }
        for (int i = 1; i <= M; i++) {
            int from = sc.nextInt();
            int to = sc.nextInt();
            list.get(from).add(to);
            list.get(to).add(from);
            sc.nextLine();
        }


        int from = sc.nextInt();
        int to = sc.nextInt();

        System.out.println(solution(from, to, list));

    }

    private static String solution(int from, int to, LinkedList<LinkedList<Integer>> list) {

        Queue<Integer> queue = new LinkedList<>();
        boolean[] visited = new boolean[list.size()];

        queue.add(from);
        visited[from] = true;
        while (!queue.isEmpty()) {
            Integer start = queue.poll();
            LinkedList<Integer> sub = list.get(start);
            for (int j = 0; j < sub.size(); j++) {

                Integer next = sub.get(j);
                if (!visited[next]) {
                    if (next == to) {
                        return "YES";
                    }
                    queue.add(next);
                    visited[next] = true;
                }

            }

        }
        return "NO";
    }
}
