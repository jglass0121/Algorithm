package _backTracking.실버3;

import java.util.Scanner;

public class n_M6 {
    static int N;
    static int M;
    static int[] arr;
    static int[] res;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         N = sc.nextInt();
         M = sc.nextInt();
         arr = new int[N];
         res = new int[N];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        fac(0);
    }

    private static void fac(int dept) {
        if (dept == M) {
            return;
        }
        if (arr.length == M) {

        }

        for (int i = 0; i < arr.length; i++) {

        }
    }
}
