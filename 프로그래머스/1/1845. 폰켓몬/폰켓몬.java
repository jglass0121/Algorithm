
import java.util.HashSet;
import java.util.Set;
class Solution {
    public int solution(int[] nums) {
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