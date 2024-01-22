package Arrays101;

import java.util.Arrays;

public class _Squares_of_a_Sorted_Array {
    public static void main(String[] args) {
        int[] nums = {-4, -1, 0, 3, 10};
        solutoin(nums);

    }

    private static int[] solutoin(int[] nums) {
        int[] arr = new int[nums.length];
        int i = 0;
        for (int n : nums) {
            n = Math.abs(n);
            arr[i] =  n * n;
            i++;
        }

         Arrays.sort(arr);

        return arr;


    }
}
