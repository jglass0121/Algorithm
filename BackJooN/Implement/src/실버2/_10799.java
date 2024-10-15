package 실버2;

import java.util.Scanner;
import java.util.Stack;

public class _10799 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        Stack<Character> stack = new Stack<>();

        int res = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == '(') {
                stack.push('(');
                continue;
            }
            if (input.charAt(i) == ')') {
                stack.pop();
                if (input.charAt(i - 1) == '(') {
                    res += stack.size();
                } else {
                    res++;
                }
            }
        }
        System.out.println(res);
    }
}
