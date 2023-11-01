package bfs;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.StringTokenizer;

public class 나이트의_이동 {
    static int[] dx = {-2, -1, 1, 2, 2, 1, -1, -2};
    static int[] dy = {1, 2, 2, 1, -1, -2, -2, -1};
    static int[][] arr;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for (int i = 0; i < num; i++) {
            int l = sc.nextInt();
            sc.nextLine();
            arr = new int[l][l];
            boolean[][] visited = new boolean[l][l];
            String[] split1 = sc.nextLine().split(" ");
            int x = Integer.parseInt(split1[0]);
            int y = Integer.parseInt(split1[1]);

            String[] split2 = sc.nextLine().split(" ");
            int willX = Integer.parseInt(split2[0]);
            int willY = Integer.parseInt(split2[1]);
            if (x == willX && y == willY) {
                System.out.println(0);

            } else {
                bfs(x, y, willX, willY);
                System.out.println(arr[willX][willY]);
            }

        }

    }

    private static void bfs(int x, int y, int willX, int willY) {
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{x, y});
        while (queue.size() != 0) {
            int[] now = queue.poll();
            for (int i = 0; i < 8; i++) {
                int nextX = now[0] + dx[i];
                int nextY = now[1] + dy[i];

                if (nextX < 0 || nextX >= arr.length || nextY < 0 || nextY >= arr.length) {
                    continue;
                }

                if (arr[nextX][nextY] == 0) {
                    arr[nextX][nextY] =  arr[now[0]][now[1]] + 1;
                    queue.add(new int[]{nextX, nextY});
                }

            }


        }
    }
}
