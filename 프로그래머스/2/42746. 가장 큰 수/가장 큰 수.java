import java.util.*;
class Solution {
    public String solution(int[] numbers) {
   // 1. int 배열을 문자열 배열로 변환
        String[] nums = new String[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            nums[i] = String.valueOf(numbers[i]);
        }

        // 2. 정렬: (o2+o1) vs (o1+o2) 비교
        Arrays.sort(nums, (o1, o2) -> (o2 + o1).compareTo(o1 + o2));

        // 3. 정렬 후 첫 값이 "0"이면 모든 값이 0이라는 의미
        if (nums[0].equals("0")) {
            return "0";
        }

        // 4. 문자열 합치기
        StringBuilder answer = new StringBuilder();
        for (String num : nums) {
            answer.append(num);
        }

        return answer.toString();
    }
}