import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(solution(str));
    }

    private static int solution(String str) {
        String[] arr = str.split("");
        Stack<String> stack = new Stack<>();

        for (int i = 0; i < arr.length; i++) {
            String s = arr[i];

            if (s.equals("(") || s.equals("[")) {
                stack.push(s);
            }

            else if (s.equals(")")) {
                if (stack.isEmpty()) return 0; // ⭐

                int sum = 0;
                while (!stack.isEmpty() && stack.peek().matches("\\d+")) {
                    sum += Integer.parseInt(stack.pop());
                }

                if (stack.isEmpty() || !stack.peek().equals("(")) return 0; // ⭐
                stack.pop(); // '(' 제거

                stack.push(sum == 0 ? "2" : String.valueOf(sum * 2));
            }

            else if (s.equals("]")) {
                if (stack.isEmpty()) return 0; // ⭐

                int sum = 0;
                while (!stack.isEmpty() && stack.peek().matches("\\d+")) {
                    sum += Integer.parseInt(stack.pop());
                }

                if (stack.isEmpty() || !stack.peek().equals("[")) return 0; // ⭐
                stack.pop(); // '[' 제거

                stack.push(sum == 0 ? "3" : String.valueOf(sum * 3));
            }
        }

        int result = 0;
        while (!stack.isEmpty()) {
            if (!stack.peek().matches("\\d+")) return 0; // ⭐
            result += Integer.parseInt(stack.pop());
        }

        return result;
    }
}
