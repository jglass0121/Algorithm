package me.two;

import javax.swing.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 미로최단거리 {
    static int[][] arr;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        arr = new int[7][7];
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        arr[0][0]  =1;
        bfs(0,0);
        if(res == 0){
            System.out.println(-1);
        }else{
            System.out.println(res);

        }

    }
    static int[] dx = {1, -1, 0, 0};
    static int[] dy = {0, 0, 1, -1};
    static int res= 0;

    private static void bfs(int x, int y) {
        Queue<int[]> queue=  new LinkedList<int[]>();
        queue.add(new int[]{0, 0,0});
        while (!queue.isEmpty()) {

            int[] now = queue.poll();
            for (int i = 0; i < 4; i++) {
                int nx = now[0] + dx[i];
                int ny = now[1] + dy[i];
                if(nx == arr.length-1 && ny == arr.length-1){
                    res = now[2]+1;
                    return;
                }

                if (nx >= 0 && ny >= 0 && nx < 7 && ny < 7 && arr[nx][ny] == 0) {
                    arr[nx][ny] = 1;
                    queue.add(new int[]{nx, ny, now[2] + 1});
                }
            }

        }

    }



}
