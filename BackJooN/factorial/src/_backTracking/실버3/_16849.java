package _backTracking.실버3;

import java.util.Scanner;

public class _16849 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M= sc.nextInt();
        visited = new boolean[N+1];
        fac(N, M, 0,"");

    }

    static boolean[] visited;
    private static void fac(int n, int m, int cnt, String res) {
        if (cnt == m) {
            System.out.println(res.trim());
            return;
        }

        for (int i = 1; i <= n; i++) {
            if (!visited[i]) {
                visited[i] = true;
                fac(n,m,cnt+1,res +" "+i);
                visited[i] = false;
            }

        }
    }
}
