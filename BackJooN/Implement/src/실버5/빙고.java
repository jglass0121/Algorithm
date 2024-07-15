package 실버5;

import java.util.Scanner;

public class 빙고 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] arr = new int[5][5];
        for (int i = 0; i < 5; i++) {
            String[] split = sc.nextLine().split(" ");
            for (int j = 0; j < 5; j++) {
                arr[i][j] = Integer.parseInt(split[j]);
            }
            sc.nextLine();
        }

        for (int i = 0; i < 5; i++) {
            String[] split = sc.nextLine().split(" ");
            for (int j = 0; j < 5; j++) {
                int find = Integer.parseInt(split[j]);

            }

        }


    }
}
