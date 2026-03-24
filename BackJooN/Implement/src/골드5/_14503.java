package 골드5;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class _14503 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        sc.nextLine();
        String[] str = sc.nextLine().split(" ");
        int i = Integer.parseInt(str[0]);
        int j = Integer.parseInt(str[1]);
        int d = Integer.parseInt(str[2]);


        int[][] arr = new int[N][M];

        for (int k = 0; k < N; k++) {
            String[] split = sc.nextLine().split(" ");
            for (int l = 0; l < M; l++) {
                arr[k][l] = Integer.parseInt(split[l]);
            }
        }


        System.out.println("Arrays.deepToString(arr) = " + Arrays.deepToString(arr));
        solution(arr, i, j, d);
    }


    static int[] dx = {1, 0, -1, 0}; // 0 1 ,2,3
    //
    static int[] dy = {0, 1,  0, -1};
    private static void solution(int[][] arr, int i, int j, int d) {
        // 현재 넣기
        Queue<int[]> queue  = new LinkedList<>();
        queue.add(new int[]{i, j, d});
        int cnt = 0;
        while (!queue.isEmpty()) {
            int[] now = queue.poll();
            int x = now[0];
            int y = now[1];
            int nowD = now[2];
            if(arr[x][y] == 0){
                arr[x][y] =1; //
                cnt++;
                // 4번 회전
                for (int k = 4; k > 0; k--) {
                    d = (d + 3) % 4; // 왼쪽 회전

                    int nx = x+dx[d];
                    int ny = y+dy[d];
                    System.out.println("nx = " + nx);
                    System.out.println("ny = " + ny);
                    if (nx < 0 || ny < 0 || nx > arr.length || ny > arr[0].length) {
                        continue;
                    }

                    if(arr[nx][ny] == 0){
                        queue.add(new int[]{nx, ny, (k+now[2]) % 4});
                    }
                }
            }else{ // 벽

                int bx = x - dx[nowD];
                int by = y - 1;

                if(arr[bx][by] == 0 ){
                    queue.add(new int[]{bx,by,nowD});
                }
            }
        }

        System.out.println(cnt);



    }
}
