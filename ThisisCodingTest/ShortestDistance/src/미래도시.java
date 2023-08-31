import java.util.Arrays;
import java.util.Scanner;

public class 미래도시 {

    public static final int INF = (int) 1e9; // 무한을 의미하는 값으로 10억을 설정
    // 노드의 개수(N), 간선의 개수(M), 거쳐 갈 노드(X), 최종 목적지 노드(K)
    public static int n, m, x, k;
    // 2차원 배열(그래프 표현)를 만들기
    public static int[][] graph = new int[101][101];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n =  sc.nextInt();
        m = sc.nextInt();
        for (int i = 0; i < 101; i++) {
            Arrays.fill(graph[i], INF);
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == j) {
                    graph[i][j] = 0;
                }
            }
        }

        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            graph[a][b] = 1;
            graph[b][a] = 1;
        }

        x =  sc.nextInt();
        k = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                for (int l = 1; l <= n; l++) {

                    graph[j][l] = Math.min(graph[j][l], graph[j][k] + graph[k][l]);
                }
            }
        }


        int dis = graph[1][k] + graph[k][x];

        if (dis >= INF) {
            System.out.println(-1);
        } else {
            System.out.println(dis);

        }

    }
}
