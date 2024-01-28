package Arrays101;

import java.util.Arrays;

public class MoveZeroes {
    public static void main(String[] args) {
        int[] nums = {0,1,0,3,12};
        solution(nums);
        
    }

    private static void solution(int[] nums) {

        //0의 개수 찾기
        int len = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                len++;
            }
        }



        int idx = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[idx] = nums[i];
                idx++;
            }
        }


        System.out.println(idx);
        for (int i = idx; i <nums.length ; i++) {
            nums[i] = 0;
        }

        System.out.println(Arrays.toString(nums));



    }
}
