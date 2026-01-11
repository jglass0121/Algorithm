package me;

import java.util.Arrays;
import java.util.Scanner;

public class 결혼식 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        int[][] arr = new int[n][2];
        for (int i = 0; i < n; i++) {
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
        }

        //R정렬
        Arrays.sort(arr, (a, b) -> {
            if (a[1] == b[1]) {
                return a[0] - b[0];
            }
            return a[1] - b[1];
        });

        System.out.println(Arrays.deepToString(arr));
        int cnt = 0;
        int endTime = arr[0][1];

        for (int i = 1; i < n; i++) {
            if (arr[i][0] < endTime) {
                System.out.println("arr[i][0] = " + arr[i][0] +" arr[1] : "+ arr[i][1]);
                System.out.println("endTime = " + endTime);
                endTime = arr[i][1];
                cnt++;
            }
            System.out.println();
        }
        System.out.println(cnt);




    }
}
