package me;

import java.util.Scanner;
import java.util.Stack;

public class 괄호문자제거1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        solution(str);
    }

    private static void solution(String str) {
        // stack이 empty일때저장

        String answer = "";
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == '(') {
                stack.add('(');
                continue;
            }
            if (c == ')') {
                stack.pop();
                continue;
            }

            if (stack.isEmpty()) {
                answer += c;
            }
        }

        System.out.println(answer);

    }

}
