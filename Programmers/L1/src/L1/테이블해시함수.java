package L1;

import java.util.Arrays;

public class 테이블해시함수 {
    public static void main(String[] args) {
        int[][] data ={
            {2,2,6},{1,5,10},{4,2,9},{3,8,3}
        };

        int col = 2;
        int row_begin = 2;
        int row_end = 3;

        solution(data, col, row_begin, row_end);
    }

    private static int solution(int[][] data, int col, int row_begin, int row_end) {

        Arrays.sort(data,(arr_1,arr_2)->{
            if (arr_1[col - 1] == arr_2[col - 1]) {
                return arr_2[0] - arr_1[0];
            } else {
                return arr_1[col - 1] - arr_2[col - 1];
            }
        });


        int[] arr = new int[row_end - row_begin + 1];
        int idx = 0;
        int sum = 0;
        for (int i = row_begin; i <= row_end ; i++) {
            int[] tuple = data[i - 1];
            for (int j = 0; j < tuple.length; j++) {
                arr[idx]+= tuple[j] % i;
            }

            sum ^= arr[idx];
            idx++;
        }

        return sum;

    }
}
