package 그리디;

import java.sql.PreparedStatement;

public class 행렬_테두리_회전 {
    public static void main(String[] args) {
        int rows = 6;
        int columns = 6;
        int[][] queries = {
                {2, 2, 5, 4}, {3, 3, 6, 6}, {5, 1, 6, 3}
        };


        solution(rows, columns, queries);
    }

    private static void solution(int rows, int columns, int[][] queries) {

        int[][] arr = new int[columns][rows];
        int idx =1;
        for (int i = 0; i < columns; i++) {
            for (int j = 0; j < rows; j++) {
                arr[i][j] = idx++;
            }
        }


        for (int i = 0; i < queries.length; i++) {
            int sy = queries[i][0] - 1;
            int sx = queries[i][1] - 1;
            int ey = queries[i][2] - 1;
            int ex = queries[i][3] - 1;

            rotation(arr,sy, sx, ey, ex);

        }
    }

    private static void rotation(int[][] arr, int sy, int sx, int ey, int ex) {
        int idx = arr[sy][ex];
        int min = Integer.MAX_VALUE;
        // 좌
        for (int i = 0; i < ex-sx; i++) {
            int res = arr[sy][ex - 1];
            Math.min(min, res);
            arr[sy][ex-i] = res;
        }

        //상

    }


}
