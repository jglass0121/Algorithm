package 실전문제;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;


public class 경쟁적_전염 {
    static class State implements Comparable<State> {
        int num;
        int y;
        int x;
        int rotNum;

        public State(int num, int y, int x, int rotNum) {
            this.num = num;
            this.y = y;
            this.x = x;
            this.rotNum = rotNum;
        }

        @Override
        public int compareTo(State o) {
            return this.num - o.num;
        }
    }


    static int N;
    static int K;
    static int[][] arr;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        K = sc.nextInt();

        arr = new int[N][N];
        LinkedList<State> list = new LinkedList<>();
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                arr[i][j] = sc.nextInt();
                if (arr[i][j] > 0) {
                    list.add(new State(arr[i][j], i, j, 0));
                }
            }
        }

        Collections.sort(list);
        Queue<State> queue = new LinkedList<>(list);

        int rot = sc.nextInt();
        int resY = sc.nextInt() - 1;
        int resX = sc.nextInt() - 1;


        bfs(queue, rot);

        System.out.println(arr[resY][resX]);


    }

    static int[] y = {1, 0, -1, 0};
    static int[] x = {0, 1, 0, -1};

    private static void bfs(Queue<State> queue, int rot) {
        while (!queue.isEmpty()) {
            State now = queue.poll();
            if(now.rotNum==rot) break;
            for (int i = 0; i < 4; i++) {
                int ny = now.y + y[i];
                int nx = now.x + x[i];
                if (ny < 0 || nx < 0 || ny >= N || nx >= N) {
                    continue;
                }
                if (arr[ny][nx] == 0 ) {
                    arr[ny][nx] = now.num;
                    int rotNum = now.rotNum + 1;
                    queue.add(new State(now.num, ny, nx, rotNum));
                }
            }

        }

    }
}
