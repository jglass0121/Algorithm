package String;

import java.util.Arrays;

public class ArrayPartitionI {
    public static void main(String[] args) {
        int[] nums = {1, 4, 3, 2};
        System.out.println(solution(nums));
    }

    private static int solution(int[] nums) {
        Arrays.sort(nums);
        int sum = 0;
        for (int i = 0; i < nums.length; i+=2) {
            int first = nums[i];
            sum += first;
        }

        return sum;

    }
}
