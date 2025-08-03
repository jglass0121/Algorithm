package th;

import java.util.Scanner;

public class 피보나치_수열_2 {
    public  static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        solution(num);
    }

    private static void solution(int num) {
        int a =1, b=1, c;
        System.out.println(a+" "+b+" ");
        for (int i = 2; i < num; i++) {
            c = a+b;
            System.out.print(c+" ");
            a =b;
            b =c;

        }
    }
}
