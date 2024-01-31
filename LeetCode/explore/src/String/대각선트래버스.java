package String;

import java.util.ArrayList;

public class 대각선트래버스 {
    public static void main(String[] args) {
        int[][] mat = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[] solution = solution(mat);
        System.out.println("solution = " + solution);

    }

    private static int[] solution(int[][] mat) {

        int nRow = mat.length;
        int nCol = mat[0].length;

        int nRowPoint = 0;
        int nColPoint = 0;

        int nIter = nRow + nCol - 1;
        int nIndex = 0;

        int[] nArrResult = new int[nRow * nCol];

        ArrayList<Integer> arrTemp = new ArrayList<>();

        for (int i = 0; i < nIter; i++) {
            arrTemp.clear();
            if (i < nCol) {
                nRowPoint = 0;
                nColPoint = i;
            } else {
                nRowPoint = i + 1 - nCol;
                nColPoint = nCol - 1;
            }

            while (nRowPoint < nRow && nColPoint >= 0) {
                arrTemp.add(mat[nRowPoint][nColPoint]);
                nRowPoint++;
                nColPoint--;
            }


            if (i % 2 == 0) {
                for (int j = arrTemp.size() - 1; j >= 0; j--) {
                    nArrResult[nIndex++] = arrTemp.get(j);
                }
            } else {
                for (int j =0; j < arrTemp.size(); j++) {
                    nArrResult[nIndex++] = arrTemp.get(j);
                }
            }
        }
        return nArrResult;

    }
}
