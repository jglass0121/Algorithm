package Arrays101;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane;

public class 최대연속것 {
    public static void main(String[] args) {
        int[] nums = {1};

        System.out.println(solution(nums));;

    }

    private static int solution(int[] nums) {


        int cnt = 0;
        int max = 0;
        for (int n : nums) {
            if (n == 1) {
                cnt++;
                max = Math.max(max, cnt);
            } else {
                cnt = 0;
            }
        }

        return max;

    }


}
