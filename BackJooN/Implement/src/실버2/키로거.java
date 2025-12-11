package 실버2;

import java.io.*;
import java.util.Stack;

public class 키로거 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());

        while (T-- > 0) {
            String s = br.readLine();
            Stack<Character> left = new Stack<>();
            Stack<Character> right = new Stack<>();

            for (char c : s.toCharArray()) {
                if (c == '<') {
                    if (!left.isEmpty()) right.push(left.pop());
                } else if (c == '>') {
                    if (!right.isEmpty()) left.push(right.pop());
                } else if (c == '-') {
                    if (!left.isEmpty()) left.pop();
                } else {
                    left.push(c);
                }
            }

            // left는 그대로 출력
            for (char c : left) sb.append(c);
            // right는 뒤집어서 출력
            while (!right.isEmpty()) sb.append(right.pop());
            sb.append("\n");
        }

        System.out.print(sb);
    }
}
