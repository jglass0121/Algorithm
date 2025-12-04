import java.util.*;
class Solution {
    public int[] solution(int[] numbers) {
       int n = numbers.length;
        int[] answer = new int[n];
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n; i++) {
            // 현재 숫자 > 스택에 있는 숫자
            while (!stack.isEmpty() && numbers[stack.peek()] < numbers[i]) {
                Integer idx = stack.pop();
                answer[idx] = numbers[i];
            }

            stack.add(i);
        }

        // 뒤에 큰 값이 없는 경우
        while (!stack.isEmpty()) {
            answer[stack.pop()] = -1;
        }

        return answer;

    }
}