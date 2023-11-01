package _11;

import java.util.Scanner;
import java.util.Stack;

public class _올바른괄호 {
    public static void main(String[] args) {
        String s = "(()(";
        System.out.println(solution(s));


    }

    private static boolean solution(String s) {
        Stack<String> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i)==('(')) {
                stack.push("(");
            } else {
                if (stack.size() == 0) {
                    return false;
                }
                stack.pop();
            }
        }


        return stack.size()==0?true:false;

    }
}
