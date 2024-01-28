package String;

import java.io.PrintStream;
import java.util.Arrays;

public class Find_Pivot_Index {
    public static void main(String[] args) {
        int[] nums = {-1,-1,-1,-1,-1,0};
        int solution = solution(nums);
        System.out.println(solution);
    }

    private static int solution(int[] nums) {
        int totalSum = Arrays.stream(nums).sum();
        int leftSum = 0;
        int pivot = 0;
        for (int i = 0; i < nums.length; i++) {
            pivot = i;
            totalSum -= nums[i];
            if (totalSum == leftSum) {
                return pivot;
            }
            leftSum += nums[i];
        }
        return -1;
    }
}
