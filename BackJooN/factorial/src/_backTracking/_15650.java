package _backTracking;

import java.util.Scanner;

public class _15650
{
    static int one;
    static int two;
    static boolean[] visited ;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        one = sc.nextInt();
        two = sc.nextInt();
        visited = new boolean[one];
        fac(0,0,"");
    }

    private static void fac(int start,int cnt, String res) {

        if (cnt == two) {
            System.out.println(res);
            return;
        }

        for (int i = start; i < one ; i++) {
             fac(i + 1,cnt+1,res+(i+1)+" ");
        }

    }
}
