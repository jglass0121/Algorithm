package me.two;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 미로최단경로2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[7][7];
        for (int i = 0; i < arr.length; i++) {
            String[] str = sc.nextLine().split(" ");
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = Integer.parseInt(str[j]);
            }
        }


        solution(arr);
        System.out.println(dis);

    }

    static int[] dx = {1, -1, 0, 0};
    static int[] dy = {0, 0, 1, -1};
    static int dis = -1;
    private static void solution(int[][] arr) {
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{0, 0, 0});
        arr[0][0] = 1;

        while (!queue.isEmpty()) {
            int[] now = queue.poll();
            int nx = now[0];
            int ny = now[1];


            for (int i = 0; i < 4; i++) {
                int x = nx + dx[i];
                int y = ny + dy[i];
                if (x < 0 || y < 0 || x >= arr.length || y >= arr.length) {
                    continue;
                }
                if( x == 6 && y == 6  && arr[x][y]==0){
                    dis =now[2]+1;
                    return;
                }

                if (arr[x][y] == 0) {
                    arr[x][y] = 1;
                    queue.add(new int[]{x, y, now[2] + 1});

                }


            }
        }

    }
}
