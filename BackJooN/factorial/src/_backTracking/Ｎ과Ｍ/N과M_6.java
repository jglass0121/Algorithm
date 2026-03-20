package _backTracking.Ｎ과Ｍ;

import java.util.Arrays;
import java.util.Scanner;

public class N과M_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
         m = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] =sc.nextInt();
        }
        visited= new boolean[n];
        fArr = new int[m];
        Arrays.sort(arr);
        fac(0,0,arr);
    }

    static  int n ;
    static  int m ;
    static boolean[] visited;
    static int[] fArr;
    private static void fac(int start ,int depth, int[] arr) {
        if(depth == m){
            for (int i = 0; i < fArr.length; i++) {
                System.out.print(fArr[i]+" ");
            }
            System.out.println();
            return;
        }
        for (int i = start ; i < arr.length; i++) {
            if(!visited[i]){
                visited[i]= true;
                fArr[depth] = arr[i];
                fac(i,depth+1,arr);
                visited[i] =false;
            }
        }
    }
}
