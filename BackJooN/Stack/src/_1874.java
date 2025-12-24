import java.io.*;
import java.util.*;

public class _1874 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Stack<Integer> stack = new Stack<>();

        int n = Integer.parseInt(br.readLine());
        int next = 1;  // 다음 push할 숫자

        for (int i = 0; i < n; i++) {
            int target = Integer.parseInt(br.readLine());

            // target까지 push
            while (next <= target) {
                stack.push(next++);
                sb.append("+\n");
            }

            // top이 target이면 pop
            if (!stack.isEmpty() && stack.peek() == target) {
                stack.pop();
                sb.append("-\n");
            } else {
                System.out.println("NO");
                return;
            }
        }

        System.out.print(sb.toString());
    }
}
