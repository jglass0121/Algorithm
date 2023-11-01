package dfs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class _11724 {
    static boolean  visited[];
    static ArrayList<ArrayList<Integer>> list;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int node = sc.nextInt();
        int vertex = sc.nextInt();

        list = new ArrayList<>();
        for (int i = 0; i < node+1; i++) {
            list.add(new ArrayList<>());
        }

        for (int i = 0; i < vertex; i++) {
            int from = sc.nextInt();
            int to = sc.nextInt();
            list.get(from).add(to);
            list.get(to).add(from);
        }

        visited = new boolean[node + 1];

        int result = 0;
        for (int i = 1; i <= node; i++) {
            if (!visited[i]) {
                dfs(i);
                result++;
            }
        }
        System.out.println(result);
    }

    private static void dfs(int start) {
        visited[start] = true;

        for (int i = 0; i < list.get(start).size(); i++) {
            int next = list.get(start).get(i);
            if (visited[next]) {
                return;
            }
            if (!visited[next]) {
                dfs(next);
            }
        }


    }
}
