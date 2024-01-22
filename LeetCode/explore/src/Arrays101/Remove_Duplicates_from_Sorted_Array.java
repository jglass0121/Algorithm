package Arrays101;

import java.util.Arrays;

public class Remove_Duplicates_from_Sorted_Array {
    public static void main(String[] args) {
        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        solution(nums);
    }

    private static int solution(int[] nums) {
        int idx = 1;
        int first =nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (first != nums[i]) {
                nums[idx] = nums[i];
                idx++;
                first = nums[i];
            }
        }


        return idx;


    }
}
