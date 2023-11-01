import java.util.LinkedList;
import java.util.Scanner;

public class _2606 {
    static boolean[] visited ;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int cnt = sc.nextInt();
        LinkedList<LinkedList<Integer>> list = new LinkedList<LinkedList<Integer>>();
        visited = new boolean[num + 1];
        for (int i = 0; i < num + 1; i++) {
            list.add(new LinkedList());
        }
        for (int i = 0; i < cnt; i++) {
            int from = sc.nextInt();
            int to = sc.nextInt();
            list.get(from).add(to);
            list.get(to).add(from);
        }


        System.out.println(dfs(1, list));
    }

    private static int dfs(int start, LinkedList<LinkedList<Integer>> list) {
        LinkedList<Integer> q = new LinkedList<>();
        q.add(start);
        visited[start] = true;
        int cnt = 0;
        while (!q.isEmpty()) {
            Integer now = q.poll();
            for (int i = 0; i < list.get(now).size(); i++) {
                Integer next = list.get(now).get(i);
                if (!visited[next]) {
                    cnt++;
                    q.add(next);
                    visited[next] = true;
                }

            }
        }

        return cnt;

    }

}
