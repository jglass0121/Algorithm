import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class _1260 {
    static LinkedList<LinkedList<Integer>> list = new LinkedList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int one = sc.nextInt();
        int two = sc.nextInt();
        int tree = sc.nextInt();
         boolean visited[] = new boolean[one+1];
         boolean visited2[] = new boolean[one+1];

        for (int i = 0; i < one+1; i++) {
            list.add(new LinkedList<>());
            visited[i] = false;
            visited2[i] = false;
        }

        for (int i = 0; i < two; i++) {
            int s = sc.nextInt();
            int e = sc.nextInt();
            input(s, e);
        }
        for (int i = 1; i <= one; i++) {
            //이동 경우의 수가 다수 존재할 경우 작은 정점부터 이동해야함으로 인접리스트 오름차순 정렬
            Collections.sort(list.get(i));
        }

        dfs(list,tree,visited);
        System.out.println();
        bfs(list,tree,visited2);

    }

    private static void bfs(LinkedList<LinkedList<Integer>> list, int tree, boolean[] visited) {
        Queue<Integer> queue = new LinkedList<>();
         queue.add(tree);
        visited[tree] = true;
        while (!queue.isEmpty()) {
            Integer start = queue.poll();
            System.out.print(start+ " ");

            for (int i = 0; i <list.get(start).size() ; i++) {
                Integer next = list.get(start).get(i);
                if (!visited[next]) {
                    visited[next] = true;
                    queue.add(next);
                }

            }

        }
        System.out.println();

    }

    private static void dfs(LinkedList<LinkedList<Integer>> list, int tree, boolean[] visited) {

        visited[tree] = true;
        System.out.print(tree+" ");
        for (int i = 0; i < list.get(tree).size(); i++) {
            Integer next = list.get(tree).get(i);
            if (!visited[next]) {
                dfs(list, next, visited);
            }

        }


    }

    private static void input(int s, int e) {
        list.get(s).add(e);
        list.get(e).add(s);
    }
}
