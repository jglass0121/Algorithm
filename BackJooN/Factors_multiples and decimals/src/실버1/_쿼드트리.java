package 실버1;

import java.util.Arrays;
import java.util.Scanner;

public class _쿼드트리 {
    static int[][] arr;
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.nextLine();
        arr = new int[num][num];
        for (int i = 0; i < num; i++) {
            String line = sc.nextLine();
            for (int j = 0; j < num; j++) {
                arr[i][j] = line.charAt(j)-'0';
            }
        }


        fac(0,0,num);
        System.out.println(sb.toString());


    }

    private static void fac(int x, int y, int size) {
        //체크
        if(check(x, y,size,arr[x][y])){
            sb.append(arr[x][y]);
            return;
        }

        sb.append("(");
        fac(x, y, size / 2);
        fac(x+size/2, y, size/2);
        fac(x, y+size/2, size/2);
        fac(x+size/2, y+size/2, size/2);
        sb.append(")");



    }

    private static boolean check(int x, int y, int size, int val) {
        for (int i = x; i <x+size; i++) {
            for (int j = y; j <y+size ; j++) {
                if (val != arr[i][j]) {
                    return false;
                }
            }
        }

            return true;

    }
}
