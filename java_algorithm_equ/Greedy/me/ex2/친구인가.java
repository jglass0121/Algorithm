package me.ex2;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

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
        LinkedList<Integer> list1 = list.get(from);
        for (Integer start : list1) {
            queue.add(start);
        }

        boolean[] visited = new boolean[list.size()];


        visited[from] = true;
        boolean isLock = false;
        while (queue.isEmpty()) {
            Integer now = queue.poll();
            LinkedList<Integer> list2 = list.get(now);
            for (Integer sub : list2) {
                if (!visited[sub]) {
                    queue.add(sub);
                    if (now == to) {
                        isLock = true;
                        break;
                    }
                    visited[sub] = true;
                }
            }
        }

        if (isLock) {
            return "YES";
        } else {
            return "NO";
        }

    }
}
