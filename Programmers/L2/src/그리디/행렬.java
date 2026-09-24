package 그리디;

import java.util.Arrays;

public class 행렬 {
    public static void main(String[] args) {
        int rows = 6;
        int columns = 6;

        int[][] queries = {
                {2, 2, 5, 4}, {3, 3, 6, 6}, {5, 1, 6, 3}
        };

        solution(rows, columns, queries);
    }

    private static void solution(int rows, int columns, int[][] queries) {
        // 전체 arr
        int[][] arr = new int[columns][rows];

        int idx =1;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j <columns ; j++) {
                arr[i][j] = idx++;

            }
        }

        System.out.println("Arrays.deepToString(arr) = " + Arrays.deepToString(arr));


        for (int[] query : queries) {
            int sx = query[0]-1;
            int sy = query[1]-1;
            int ex = query[2]-1;
            int ey = query[3]-1;

            //rotation
            rotation(arr, sx, sy, ex, ey);
        }

    }

    private static void rotation(int[][] arr, int sx, int sy, int ex, int ey) {

        //2,2,5,4
        //좌
        int idx = arr[sx][ey];

        for (int i = sy; i < ey ; i++) { // 2 . 3. 4
            arr[sy][ey-i] = arr[sy][ey - 1];
        }

        //밑

        //옆

        //위


    }
}
