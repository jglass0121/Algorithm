package _backTracking;

import java.util.Scanner;

public class _15649 {
    static boolean[] visited;
    static int two;
    static int[] arr;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int one = sc.nextInt();
        two = sc.nextInt();
        arr = new int[one];
        for (int i = 0; i < one; i++) {
            arr[i] = i + 1;
        }


        visited = new boolean[one];

        fac(0,"");
    }

    private static void fac( int cnt, String res) {
        if (two == cnt) {
            System.out.println(res);
            return;
        }

        for (int i = 0; i < arr.length; i++) {
            if (!visited[i]) {
                visited[i] = true;
                String res1 = res + arr[i] + " ";
                fac(cnt+1, res1);
                visited[i] = false;
            }
        }

    }
}
