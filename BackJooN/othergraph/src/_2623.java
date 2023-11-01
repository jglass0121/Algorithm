import java.io.*;
import java.util.*;

public class _2623 {
    public static int n, m;
    public static ArrayList<Integer>[] graph;
    public static int[] inDegree;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        graph = new ArrayList[n + 1];
        inDegree = new int[n + 1];

        for (int i = 1; i <= n; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int k = Integer.parseInt(st.nextToken());
            int prev = -1;

            for (int j = 0; j < k; j++) {
                int singer = Integer.parseInt(st.nextToken());

                if (prev != -1) {
                    graph[prev].add(singer);
                    inDegree[singer]++;
                }

                prev = singer;
            }
        }

        ArrayList<Integer> result = topologicalSort();

        if (result.size() == n) {
            for (int singer : result) {
                System.out.println(singer);
            }
        } else {
            System.out.println(0);
        }
    }

    public static ArrayList<Integer> topologicalSort() {
        ArrayList<Integer> result = new ArrayList<>();
        Queue<Integer> queue = new LinkedList<>();

        for (int i = 1; i <= n; i++) {
            if (inDegree[i] == 0) {
                queue.offer(i);
            }
        }

        while (!queue.isEmpty()) {
            int current = queue.poll();
            result.add(current);

            for (int next : graph[current]) {
                inDegree[next]--;
                if (inDegree[next] == 0) {
                    queue.offer(next);
                }
            }
        }

        return result;
    }
}
