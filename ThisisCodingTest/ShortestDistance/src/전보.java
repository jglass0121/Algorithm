import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.StringTokenizer;

public class 전보 {

    static ArrayList<Integer[]>[] graph;
    static Boolean[] visited;
    static int[] dist;
    static int count=0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringTokenizer st = new StringTokenizer(sc.nextLine());

        int a = Integer.parseInt(st.nextToken()); // 노드
        int b = Integer.parseInt(st.nextToken()); //간선 개수
        int c = Integer.parseInt(st.nextToken()); //거리

        graph =new ArrayList[a + 1];
        visited = new Boolean[a + 1];
         dist = new int[a + 1];

        for (int i = 1; i <= a; i++) {
            graph[i] = new ArrayList<>();
            dist[i] = -1;
            visited[i] = false;
        }

        //간선
        for (int i = 0; i < b; i++) {
            st = new StringTokenizer(sc.nextLine());
            int n = Integer.parseInt(st.nextToken());//노드
            int v = Integer.parseInt(st.nextToken()); //다음 간선
            int d = Integer.parseInt(st.nextToken()); //거리
            graph[n].add(new Integer[]{v,d});
        }

        dijkstar(graph, c);

        int max = 0;
        for (int i = 1; i <= a; i++) {
            if (dist[i] == -1) {
                continue;
            } else {
                max = Math.max(max, dist[i]);
            }
        }

        System.out.println(count);
        System.out.println(max);



    }

    private static void dijkstar(ArrayList<Integer[]>[] graph, int start) {
        PriorityQueue<Integer[]> q = new PriorityQueue<Integer[]>(((o1, o2) -> o1[1] - o2[1]));

        q.add(new Integer[]{start, 0});
        dist[start] = 0;


        while (!q.isEmpty()) {
            Integer[] now = q.poll();

            if (visited[now[0]]) {
                continue;
            }

            visited[now[0]] = true; //다음 노드 true
            for (Integer[] next: graph[now[0]]) { //다음 노드들
                if (!visited[next[0]] && dist[next[0]] == -1 || dist[next[0]] > now[1] + next[1]) {
                    dist[next[0]] = now[1] + next[1]; //거리
                    count++;

                    //다음 노드와 값
                    q.add(new Integer[]{next[0], dist[next[0]]}); // 다음 노드
                }
            }
                System.out.println();
        }
    }
}
