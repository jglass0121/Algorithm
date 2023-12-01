package 골드5;

import java.util.*;

public class _호석이_두마리치킨 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); //건물
        int M = sc.nextInt(); //도로
        LinkedList<LinkedList<Integer>> list = new LinkedList<>();
        for (int i = 0; i < N+1; i++) {
            list.add(new LinkedList<>());
        }

        for (int i = 0; i < M; i++) {
            int from = sc.nextInt();
            int to = sc.nextInt();
            list.get(from).add(to);
            list.get(to).add(from);
        }


        for (int i = 1; i <= M; i++) {
            int[] dis = new int[N+1];
            Arrays.fill(dis, Integer.MAX_VALUE);

            int first = i; // 치킨 위치
            int two = i+1;

            dis[first] = 0;
            dis[two] = 0;

            PriorityQueue<Integer> queue = new PriorityQueue<>();
            queue.add(first);
            queue.add(two);
            while (!queue.isEmpty()) {
                Integer now = queue.poll();
                for (int next : list.get(now)) {
                    if (dis[next] == 0) {
                        continue;
                    }
                    dis[next] += 2;
                    queue.add(next);

                }
            }

            for (int j = 0; j < N + 1; j++) {
                System.out.println(dis[j]);
            }
        }



    }
}

