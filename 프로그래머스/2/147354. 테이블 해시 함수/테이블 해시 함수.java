import java.util.Arrays;

class Solution {
    public int solution(int[][] data, int col, int row_begin, int row_end) {
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