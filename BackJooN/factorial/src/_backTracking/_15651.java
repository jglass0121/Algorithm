package _backTracking;

import java.util.Scanner;

public class _15651 {
    static int one;
    static int two;
    static int[] arr;

    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        one = sc.nextInt();
        two = sc.nextInt();
        arr = new int[two];
        fac(0);
        System.out.println(sb);

    }

    private static void fac(int cnt) {

        if (cnt == two) {
            for (int i = 0; i < two; i++) {
                sb.append(arr[i]+" ");
            }
            sb.append('\n');
            return;
        }

        for (int i = 1; i <= one; i++) {
            arr[cnt] = i;
            fac(cnt + 1);
        }
    }

}
