package Arrays101;

import java.util.Arrays;

public class Sort_Array_By_Parity {
    public static void main(String[] args) {
        int[] nums = {3, 1, 2, 4};

        solution(nums);
    }

    private static int[] solution(int[] nums) {

      if(nums.length<2 ) return nums;

        int idx = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                int temp = nums[idx];
                nums[idx++] = nums[i];
                nums[i] = temp;
            }
        }
        return nums;

    }


}
