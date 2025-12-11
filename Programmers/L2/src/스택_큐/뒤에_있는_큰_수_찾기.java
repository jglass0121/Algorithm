package 스택_큐;

import java.util.Stack;

public class 뒤에_있는_큰_수_찾기 {
    public static void main(String[] args) {
        int[] numbers = {2, 3, 3, 5};
        solution(numbers);
    }

    private static int[] solution(int[] numbers) {
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
