package L2;

import java.util.Arrays;

public class _행렬연산 {
    public static void main(String[] args) {
        int[][] rc = {{
            1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12
        }};

        String[] operations = {"ShiftRow", "Rotate", "ShiftRow", "Rotate"};

        System.out.println(Arrays.deepToString(solution(rc,operations)));
    }

    private static int[][] solution(int[][] rc, String[] operations) {

        for (String op: operations) {
            int len = rc.length-1; //3
            int width = rc[0].length-1; //4

            if (op.equals("Rotate")) {

            } else {
                int[] lastRows = new int[width+1];
                for (int i = 0; i <= width; i++) {
                    lastRows[i] = rc[len][i];
                }

                for (int i = len - 1; i >= 0; i--) {
                    for (int j = 0; j <= width; j++) {
                        rc[i + 1][j] = rc[i][j];
                    }
                }
                for (int i = 0; i <= width; i++) {
                    rc[0][i] = lastRows[i];
                }
            }


        }
        return rc;

    }
}
