package 실버1;

import java.util.Scanner;

public class 쿼드트리 {
    public static void main(String[] args) {
        // fac
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.nextLine();
        int[][] arr =new int[num][num];
        for (int i = 0; i < num; i++) {
            String[] str = sc.nextLine().split("");
            for (int j = 0; j < num; j++) {
                arr[i][j] = Integer.parseInt(str[j]);
            }
        }

        System.out.println(solution(arr));
    }

    static  StringBuilder sb;
    private static String solution(int[][] arr) {
        sb = new StringBuilder();
        fac(arr,0,0,arr.length);
         return sb.toString();
    }

    private static void fac(int[][] arr, int x, int y, int size) {
        if(isSame(arr,x,y,size,arr[x][y])){
            sb.append(arr[x][y]);
            return;
        }

        sb.append("(");
        fac(arr,x,y,size/2);
        fac(arr,x,y+size/2,size/2);
        fac(arr,x+size/2,y,size/2);
        fac(arr,x+size/2,y+size/2,size/2);
        sb.append(")");

    }

    private static boolean isSame(int[][] arr, int x, int y, int size, int val) {

        for (int i = x; i < x+size; i++) {
            for (int j = y; j < y+size; j++) {
                if(arr[i][j] != val){
                    return false;
                }
            }
        }
        return true;
    }
}
