package _11;

import java.util.Stack;

public class _괄호_회전하기 {
    public static void main(String[] args) {
        //s의  len까지 for문
        // 올바른 문자열 - +1

        // cnt =0;
        //stack으로

        String s = "[](){}";
        solution(s);
    }

    private static void solution(String s) {
        int cnt =0;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            sb.append(s.charAt(i));
        }
        for (int i = 0; i < s.length(); i++) {
            String str = sb.toString();
            Stack<Character> stack = new Stack<>();
            boolean isRight = true;

            for (int j = 0; j < str.length(); j++) {
                char c = str.charAt(j);
                if(c =='('){
                    stack.add(c);
                }else if(c=='{'){
                    stack.add(c);
                }else if(c=='['){
                    stack.add(c);
                }

                if(c ==')'){
                    if(stack.isEmpty()) {
                        isRight = false;
                        break;
                    }else{
                        if(stack.pop() !='('){
                            isRight = false;
                        }
                    }
                } else if (c == '}') {
                    if(stack.isEmpty()) {
                        isRight = false;
                        break;
                    }else{
                        if(stack.pop() !='{'){
                            isRight = false;
                        }
                    }

                }else if(c==']'){
                    if(stack.isEmpty()) {
                        isRight = false;
                        break;
                    }else{
                        if(stack.pop() !='['){
                            isRight = false;
                        }
                    }
                }
            }
            if(isRight && stack.isEmpty()){
                cnt++;
            }

            char charFirst = sb.charAt(0);
            sb.append(charFirst);
            sb.deleteCharAt(0);

        }

        System.out.println(cnt);
    }

}
