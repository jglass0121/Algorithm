// 투포인터
import java.util.*;
class Solution {
    public int[] solution(int[] numbers) {
                TreeSet<Integer> set = new TreeSet<>();

        int start = 0;
        int end = 1;

        // 너의 코드 스타일 그대로: 투포인터 while 구조 유지
        while (start < numbers.length - 1) {

            // end가 배열 끝을 넘으면 start 증가
            if (end >= numbers.length) {
                start++;
                end = start + 1;
                continue;
            }

            // 정상 범위면 합 추가
            set.add(numbers[start] + numbers[end]);

            // end 이동
            end++;
        }


        
int[] arr = set.stream()
               .mapToInt(Integer::intValue)
               .toArray();
        return arr;
    }
}