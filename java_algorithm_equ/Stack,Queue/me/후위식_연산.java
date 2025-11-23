package me;

import java.util.Scanner;
import java.util.Stack;

public class 후위식_연산 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        // () > */ > +-

        // 연산자가 나올시 계산 후 stack에 push
        Stack<Integer> stack = new Stack<>();
        char[] arr = str.toCharArray();

        for (int i = 0; i < arr.length; i++) {
            char c = arr[i];
            if (c == '+' || c == '-' || c == '*' || c == '/' ) {
                // 계산 후 push
                Integer two = stack.pop();
                Integer one = stack.pop();
                //c가 어떤 것인가에 따라 계산
                int res = 0 ;
                switch (c) {
                    case '+':
                        res = one + two;
                        break;
                    case '-':
                        res = one - two;
                        break;
                    case '*':
                        res = one * two;
                        break;
                    case '/':
                        res = one / two;
                        break;
                }

                stack.push(res);
            }
            if (Character.isDigit(c)) {
                stack.push(c-'0');

            }

        }
        System.out.println(stack.pop());

    }
}
