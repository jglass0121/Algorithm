package codeUp;

import java.util.Scanner;

public class _1904 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int one = sc.nextInt();
        int two = sc.nextInt();
        fac(one,two);
    }

    private static void fac(int i, int j) {
        if (i > j) {
            return;
        }
        if (i % 2 == 1) {
            System.out.println(i);
        }
        i++;
        fac(i, j);
    }
}
