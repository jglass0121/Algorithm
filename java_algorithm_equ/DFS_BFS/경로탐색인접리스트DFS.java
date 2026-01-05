import java.util.ArrayList;
import java.util.Scanner;

public class 경로탐색인접리스트DFS {
    static int n,m, answer = 0;
    static ArrayList<ArrayList<Integer>> graph;
    static int[] ch;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        graph = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<Integer>());
        }
        ch = new int[n+1];
        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b= sc.nextInt();
            graph.get(a).add(b);
        }

        dfs(1);
        System.out.println(answer );
    }

    private static void dfs(int v) {
        if (v == n) {
            answer++;
        } else {
            for (int nv : graph.get(v)){
                ch[nv] =1;
                dfs(nv);
                ch[nv] = 0;
            }
        }
    }
}
