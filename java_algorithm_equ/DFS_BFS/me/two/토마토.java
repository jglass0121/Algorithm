package me.two;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 토마토 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        sc.nextLine();
        int[][] arr = new int[N][M];
        Queue<int[]> queue = new LinkedList<>();
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                arr[i][j] = sc.nextInt();

                if (arr[i][j] == 1) {
                    queue.add(new int[]{i, j, 1});
                }
            }
        }

        bfs(queue,arr);


        System.out.println("Arrays.deepToString(arr) = " + Arrays.deepToString(arr));
        boolean isAll = true;
        int max = 0;
        outer : for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] == 0) {
                    isAll = false;
                    break outer;
                }
                max = Math.max(arr[i][j], max);
            }
        }

        if (isAll) {
            System.out.println(max);
        } else {
            System.out.println(-1);
        }



    }

    static int[] dx = {1, -1, 0, 0};
    static int[] dy = {0, 0, -1, 1};

    private static int[][] bfs(Queue<int[]> queue, int[][] arr) {
        while (!queue.isEmpty()) {
            int[] now = queue.poll();
            int x = now[0];
            int y = now[1];
            int time = now[2];

            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];

                if (nx < 0 || ny < 0 || nx >= arr.length || ny >= arr[0].length ) {
                    continue;
                }
                if (arr[nx][ny] == 1 || arr[nx][ny] == -1) {
                    continue;
                }
                if (arr[nx][ny] == 0) {
                    arr[nx][ny] = time+1;
                    queue.add(new int[]{nx, ny, time + 1});
                }
            }
        }

        return arr;
    }
}
