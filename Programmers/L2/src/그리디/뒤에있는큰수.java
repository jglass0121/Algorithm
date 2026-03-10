package 그리디;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class 뒤에있는큰수 {
    public static void main(String[] args) {
        int[] numbers = {9, 1, 5, 3, 6, 2};
        solution(numbers);
    }

    private static int[] solution(int[] numbers) {

        int n = numbers.length;
        int[] answer = new int[n];
        Arrays.fill(answer, -1);

        Stack<Integer> stack = new Stack<>();

        for(int i = 0; i < n; i++) {
            while(!stack.isEmpty() && numbers[stack.peek()] < numbers[i]) {
                answer[stack.pop()] = numbers[i];
            }
            stack.push(i);
        }

        return answer;
    }
}
