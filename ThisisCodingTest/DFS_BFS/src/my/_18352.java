package my;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class _18352 {
    public static int[] d = new int[300001];
    public static ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();

    public static LinkedList<Integer> arr = new LinkedList<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int K = sc.nextInt();
        int X = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i<= N; i++) {
            list.add(new ArrayList<Integer>());
            d[i] = -1;
        }

        for (int i = 0; i < M; i++) {
            int from = sc.nextInt();
            int to = sc.nextInt();
            list.get(from).add(to);
            sc.nextLine();
        }

        bfs( X);
        boolean check = false;
        for (int i = 1; i <= N; i++) {
            if (d[i] == K) {
                System.out.println(i);
                check = true;
            }
        }
        if(!check) System.out.println(-1);

    }

    private static void bfs(int start) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(start);
        d[start] = 0;
        while (!queue.isEmpty()) {
            Integer now = queue.poll();
            for (int i = 0; i < list.get(now).size(); i++) {
                Integer next = list.get(now).get(i);
                if (d[next] ==-1) {
                    d[next] = d[now]+1;
                    queue.add(next);
                }
            }

        }
    }


}
