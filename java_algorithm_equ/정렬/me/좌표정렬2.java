package me;

import java.util.Arrays;
import java.util.Scanner;

public class 좌표정렬2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.nextLine();
        int[][] arr = new int[num][2];
        for (int i = 0; i < num; i++) {
            String[] split = sc.nextLine().split(" ");
            arr[i][0] = Integer.parseInt(split[0]);
            arr[i][1] = Integer.parseInt(split[1]);
        }

        int[][] solution = solution(arr);
        for (int[] x : arr) {
            System.out.println(x[0] +" "+x[1]);

        }

    }

    private static int[][] solution(int[][] arr) {

        Arrays.sort(arr,(arr_1,arr_2)->{
            if (arr_1[0] == arr_2[0]) {
                return arr_1[1] - arr_2[1];
            } else {
                return arr_1[0] - arr_2[0];
            }
        });

        return arr;

    }
}
