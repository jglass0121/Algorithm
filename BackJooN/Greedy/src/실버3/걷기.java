package 실버3;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 걷기 {
    static int resY;
    static int resX;
    static int[][] arr;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] split = sc.nextLine().split(" ");
        resY = Integer.parseInt(split[0])+1;
        System.out.println("resY = " + resY);
        resX = Integer.parseInt(split[1])+1;
        System.out.println("resX = " + resX);
        int direct= Integer.parseInt(split[2]);
        int diagonal = Integer.parseInt(split[3]);

         arr = new int[resY][resX];
        for (int i = 0; i < resY; i++) {
            for (int j = 0; j < resX; j++) {
                arr[i][j] = Integer.MAX_VALUE;
            }
        }
        arr[0][0] = 0;

        solution( direct, diagonal);

    }

    static int[] dy = {1, 0, -1, 0, 1, -1, 1, -1};
    static int[] dx = {0, 1, 0, -1, 1, 1, -1, -1};

    private static void solution( int direct, int diagonal) {
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{0, 0});

        while (!queue.isEmpty()) {
            int[] now = queue.poll();
            System.out.println("now = " + now[0]);
            System.out.println("now = " + now[1]);
            for (int i = 0; i < 8; i++) {
                int ny = now[0] + dy[i];
                int nx = now[1] + dx[i];

                if (ny < 0 || nx < 0 || ny >= resY || nx >= resX) {
                    continue;
                }


                int nowVal = arr[now[0]][now[1]];
                int nextVal = 0;
                if (4 <= i) { // 직선
                    nextVal= nowVal + direct;
                } else { //대각선
                    nextVal = nowVal + diagonal;
                }

                if (arr[ny][nx] >= nextVal) {
                    arr[ny][nx] = nextVal;
                    queue.add(new int[]{ny, nx});
                }
                System.out.println("arr[ny][nx] = " + arr[ny][nx]);


            }
        }

        System.out.println("arr[resY][resX] = " + arr[resY-1][resX-1]);


    }


}
