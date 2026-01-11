package me;

import java.util.Arrays;
import java.util.Scanner;

public class 씨름_선수 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[][] arr = new int[N][2];
        for (int i = 0; i < arr.length; i++) {
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
        }


        int no = 0;

        // 모두 높은 지원지가 존재일 시 탈락
        for (int i = 0; i < arr.length; i++) {
            int h = arr[i][0];
            int w = arr[i][1];

            for (int j = 0; j < arr.length; j++) {
                if(i==j) continue;
                int otherH = arr[j][0];
                int otherW = arr[j][1];

                if (h < otherH && w < otherW) {
                    no++;
                    break;
                }
            }
        }

        System.out.println(N-no);

    }
}
