package 실버1;

import java.util.Scanner;

public class 곱셈 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a =  sc.nextInt();
        int b =  sc.nextInt();
        int c =  sc.nextInt();

        long res = 1;
        for (int i = 0; i <b ; i++) {
            res *= a;
        }

        System.out.println(res%c);


    }
}
