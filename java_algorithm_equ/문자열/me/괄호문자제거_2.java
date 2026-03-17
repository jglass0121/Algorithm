package me;

import java.util.Scanner;
import java.util.Stack;

public class 괄호문자제거_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        //stck - empty시 answer에 추가
        String answer = "";
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if(c=='(') {
                stack.push('(');
                continue;
            }
            else if(c == ')') {
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
