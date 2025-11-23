package me;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class 좌표정렬 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.nextLine();
        int[][] arr = new int[num][num];
        for (int i = 0; i < num; i++) {
            String[] split = sc.nextLine().split(" ");
            arr[i][0] = Integer.parseInt(split[0]);
            arr[i][1] = Integer.parseInt(split[1]);
        }

        Arrays.sort(arr, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if(o1[0] == o2[0]){
                    return o1[1]-o2[1];
                }
                return o1[0] - o2[0];
            }
        });

        for (int i = 0; i < num; i++) {
            System.out.print(arr[i][0]+" "+arr[i][1]);
            System.out.println();
        }
    }
}
