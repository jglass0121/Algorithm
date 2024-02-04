package String;

public class MaxConsecutiveOnes {
    public static void main(String[] args) {
        int[] nums = {1, 1, 0, 1, 1, 1};
        int solution = solution(nums);
        System.out.println("solution = " + solution);
    }

    private static int solution(int[] nums) {

        int zeroCnt = 0;
        String str = "";
        for (int i = 0; i < nums.length; i++) {
            str += nums[i];
            if (nums[i] == 0) {
                zeroCnt++;
            }
        }


        if (zeroCnt == 0 ) {
            return nums.length;
        }


        String[] split = str.split("0");

        int max = 0;
        for (int i = 0; i < split.length; i++) {
            int length = split[i].length();
            if (max < length) {
                max = length;
            }
        }

        return max;

    }
}
