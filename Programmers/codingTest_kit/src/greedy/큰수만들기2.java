package greedy;

import java.util.Stack;

public class 큰수만들기2 {
    public static void main(String[] args) {
        String number = "4177252841";
        int k = 4;
        solution(number, k);
    }

    private static void solution(String number, int k) {

        Stack<Character> stack = new Stack<>();
        for (char num : number.toCharArray()) {
            System.out.println("stack = " + stack);
            System.out.println("k = " + k);
            while (!stack.isEmpty() && k > 0 && stack.peek() < num) {
                stack.pop();
                k--;
            }

            stack.push(num);
        }

        System.out.println(k);
        System.out.println("stack = " + stack);
        while (k-- > 0) {
            stack.pop();
        }

        StringBuilder sb = new StringBuilder();
        for (char c : stack) {
            sb.append(c);
        }

        System.out.println(sb.toString());
    }
}
