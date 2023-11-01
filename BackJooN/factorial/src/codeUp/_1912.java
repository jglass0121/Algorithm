package codeUp;

import java.util.Scanner;

public class _1912 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        System.out.println(fac(i));
        ;
    }

    private static int fac(int i) {


        if (i <= 1) {
            return 1;
        }

        return fac(i - 1) * i;
    }
}
