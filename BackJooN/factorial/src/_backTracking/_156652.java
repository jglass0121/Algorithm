package _backTracking;

import java.io.*;
import java.util.StringTokenizer;

public class _156652 {
    static int N, M;
    static int[] selected;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        selected = new int[M];

        dfs(1, 0);

        br.close();
    }

    static void dfs(int start, int depth) {
        if (depth == M) {
            for (int num : selected) {
                System.out.print(num + " ");
            }
            System.out.println();
            return;
        }

        for (int i = start; i <= N; i++) {
            selected[depth] = i;
            dfs(i, depth + 1);
        }
    }
}
