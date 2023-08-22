package 해쉬;

import java.util.HashSet;
import java.util.Set;

public class 폰켓몬 {
    public static void main(String[] args) {
        int nums[] = {3,1,2,3};
        System.out.println(solution(nums));
        ;
    }

    private static int solution(int[] nums) {
        int answer = 0;
        int have = nums.length/2;
        Set<Integer> s = new HashSet<>();

        for(int i = 0;i<nums.length;i++){
            s.add(nums[i]);
        }

        if(s.size()<=have){
            answer = s.size();
        }else{
            answer = have;
        }

        return answer;
    }

}
