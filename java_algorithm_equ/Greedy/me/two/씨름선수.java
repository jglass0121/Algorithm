package me.two;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class 씨름선수 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[][] arr = new int[num][2];
        for (int i = 0; i < num; i++) {
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
        }

        solution(arr);

    }

    private static void solution(int[][] arr) {
        Arrays.sort(arr,(a,b)->{
            if (b[0] == a[0]) {
                return b[1] - a[1];
            }
            return  a[0] -b[0];
        });


        int cnt = 0;

         for (int i = 0; i < arr.length; i++) {
             int now = arr[i][1];
             boolean isLock =true;
             for (int j = i+1; j < arr.length; j++) {
                 int compare = arr[j][1];
                 if (now < compare) {
                     isLock = false;
                     break;
                 }
            }

             if (isLock) {
                 cnt++;
             }
        }

        System.out.println(cnt);


    }
}
