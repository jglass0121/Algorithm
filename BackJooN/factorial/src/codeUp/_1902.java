package codeUp;

import java.util.Scanner;

public class _1902 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        fac(i);

    }

    private static void fac(int i) {
        System.out.println(i);
        if (i <= 1) {
            return;
        }
        fac(i - 1);
    }
}
