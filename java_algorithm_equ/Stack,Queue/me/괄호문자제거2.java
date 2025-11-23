package me;

import java.util.Scanner;
import java.util.Stack;

// string,
public class 괄호문자제거2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        solution(str);
    }

    private static void solution(String str) {
        char[] arr = str.toCharArray();
        Stack<String> stack = new Stack<>();
        String answer = "";
        for (int i = 0; i < arr.length; i++) {
            //괄호가 있으면 문자열 추가하지 않기
            String c = ""+arr[i];
            if (c.equals("(")) {
                stack.push("(");
            }
            if(c.equals(")")){
                stack.pop();
            }else if (stack.isEmpty()) {
                answer += "" + arr[i];
            }

        }

        System.out.println(answer);

    }

}
