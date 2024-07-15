import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;



public class _10828 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Integer> stack = new Stack();
        int num = Integer.parseInt(br.readLine());
        for (int i = 0; i < num; i++) {
            solution(stack, br.readLine());
        }

    }

    private static void solution(Stack stack, String str) {
        StringTokenizer st = new StringTokenizer(str);

        String value = st.nextToken();

        StringBuilder sb = new StringBuilder();
        switch (value) {

            case"push":
                stack.add(Integer.parseInt(st.nextToken()));
                break;

            case "top":
                if (!stack.empty()) {
                    sb.append(stack.peek()).append("\n");

                } else {
                    sb.append(-1).append("\n");
                }

                break;
            case "size":
                sb.append(stack.size()).append("\n");
                break;
            case "empty":
                if (stack.empty()) {
                    sb.append(1).append("\n");
                } else {
                    sb.append(0).append("\n");
                }
                break;

            case "pop":
                if (stack.empty()) {
                    sb.append(-1).append("\n");
                } else {
                    sb.append(stack.pop()).append("\n");
                }
                break;

        }


        System.out.print(sb);

    }


}
