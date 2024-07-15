package L1;

import java.util.Arrays;

public class _1 {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 3, 2, 0},
                {2, 0, 1, 3},
                {1, 2, 0, 3}
        };

        solution(arr);
    }

    private static void solution(int[][] arr) {

        int[] arr2 = new int[arr[0].length];
        int[] res = new int[arr[0].length];
        for (int i = 0; i < arr2.length; i++) {
            int total = 0;
            int ny = 0;
            for (int j = 0; j < arr.length; j++) {
                for (int k = 0; k < arr[j].length; k++) {
                    if (arr[j][k] == i) {
                        if (j == 0) {
                            ny = k;
                            continue;
                        }
                        int abs = Math.abs(ny - k);
                        total += abs;
                        ny = k;
                    }
                }
            }
            res[i] = total;
        }

        System.out.println(Arrays.toString(res));



    }
}
