package me;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 피자배달거리 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        sc.nextLine();
        int[][] arr = new int[N][N];
        LinkedList<int[]> one = new LinkedList<>();
        Queue<int[]> two = new LinkedList<>();

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                arr[i][j] = sc.nextInt();
                if (arr[i][j] == 1) {
                    one.add(new int[]{i+1, j+1});
                }
                if (arr[i][j] == 2) {
                     two.add(new int[]{i+1, j+1});
                }
            }
        }
        int[][] home = new int[one.size()][2];
        for (int i = 0; i < one.size(); i++) {
            int[] get = one.get(i);
            home[i][0] = get[0];
            home[i][1] = get[1];
        }

        System.out.println("Arrays.deepToString(home) = " + Arrays.deepToString(home));

        bfs(home, two,M);


    }

    private static void bfs(int[][] home, Queue<int[]> pizza, int m) {

        //각집과 - 피자거리
        int[] arr = new int[pizza.size()];

        int idx = 0;
        while (!pizza.isEmpty()) {
            int[] pizzaHome = pizza.poll();
            int pizzaX = pizzaHome[0];
            int pizzaY = pizzaHome[1];

            int total = 0;
            for (int i = 0; i < home.length; i++) {
                int homeX = home[i][0];
                int homeY = home[i][1];
                total += Math.abs(pizzaX - homeX) + Math.abs(pizzaY - homeY);
            }
            System.out.println("total = " + total);
            arr[idx++] = total;
        }

        Arrays.sort(arr);
        System.out.println("Arrays.toString(arr) = " + Arrays.toString(arr));
        System.out.println(arr[m - 1]);

    }
}
