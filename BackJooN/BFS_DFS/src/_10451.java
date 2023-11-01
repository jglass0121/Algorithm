import java.util.*;

public class _10451 {
    static boolean[] visited ;
    static LinkedList<ArrayList<Integer>> list;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        for (int i = 0; i < num; i++) {
            int c = sc.nextInt();
            sc.nextLine();
            String[] split = sc.nextLine().split(" ");
            list  = new LinkedList<>();
            visited = new boolean[c+1];
             int cnt = 0;

            for (int j = 0; j < c+1; j++) {
                list.add(new ArrayList<Integer>());
            }

            for (int j = 0; j < split.length; j++) {
                list.get(j+1).add(Integer.parseInt(split[j]));

            }

            for (int j = 1; j <= c; j++) {
                if (!visited[j]) {
                    bfs(j);
                    cnt++;
                }

            }
            System.out.println( cnt);
        }

    }

    private static void bfs(int start) {
        Queue<Integer> q = new LinkedList<>();
        q.add(start);
        visited[start] = true;
        while (q.size()!=0) {
            Integer poll = q.poll(); // 1 ->3
            if (!visited[list.get(poll).get(0)]) {
                Integer next = list.get(poll).get(0);
                visited[next] = true;
                q.add(next);
            }
        }
    }
}
