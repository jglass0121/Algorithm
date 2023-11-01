package 실버2;

import java.util.Scanner;

public class _6603 {
    static int k;
    static int[] S;
    static boolean[] selected;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            k = sc.nextInt();
            if (k == 0) {
                break;
            }

            S = new int[k];
            selected = new boolean[k];

            for (int i = 0; i < k; i++) {
                S[i] = sc.nextInt();
            }

            dfs(0, 0);
            System.out.println();
        }
    }

    static void dfs(int start, int depth) {
        if (depth == 6) {
            printSelected();
            return;
        }

        for (int i = start; i < k; i++) {
            if (!selected[i]) {
                selected[i] = true;
                dfs(i + 1, depth + 1);
                selected[i] = false;
            }
        }
    }

    static void printSelected() {
        for (int i = 0; i < k; i++) {
            if (selected[i]) {
                System.out.print(S[i] + " ");
            }
        }
        System.out.println();
    }
}
