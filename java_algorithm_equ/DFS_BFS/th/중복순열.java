package th;

import java.util.Map;
import java.util.Scanner;


public class 중복순열 {
    static int n, m;
    static int[] pm;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         n = sc.nextInt();
         m = sc.nextInt();
        pm = new int[m];
        DFS(0);

    }

    private static void DFS(int depth) {
        if (depth == m) {
            for (int x : pm) {
                System.out.print(x + " ");
            }
            System.out.println();

        }else {
            for (int i = 1; i <= n; i++) {
                pm[depth] = i;
                DFS(depth + 1);
            }
        }

    }
}
