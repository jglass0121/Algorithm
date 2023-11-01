package codeUp;

import java.util.Scanner;

public class _1905 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(fac(num));

    }

    private static int fac(int num) {

        if (num ==0) {
            return 0;
        }

        return fac(num-1)+num;


    }
}
