package stack.src;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class _10828 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack stack = new Stack();
        int num = Integer.parseInt(br.readLine());
        for (int i = 0; i < num; i++) {
            int solution = solution(stack, br.readLine());
            System.out.println(solution);
        }

    }

    private static int solution(Stack stack, String str) {
        StringTokenizer st = new StringTokenizer(str);
        String value = null;
        if (st.hasMoreTokens()) {
            value =  st.nextToken();
        }

        switch (value) {
            case "push":
                stack.add(st.nextToken());
                break;
            case "top":
                return (int) stack.peek();
            case "size":
                return stack.size();
            case "empty":
                if (stack.empty()) {
                    return 1;
                } else {
                    return 0;
                }
            case "pop":
                return (int) stack.pop();
        }

        return 0;
    }

}
