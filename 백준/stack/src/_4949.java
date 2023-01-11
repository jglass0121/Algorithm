import java.util.Scanner;
import java.util.Stack;

public class _4949 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String read;
        while (true) {
            read = sc.nextLine();


            if (read.equals(".")) {
                break;
            }

            System.out.println(solve(read));
        }
    }

    public static String solve(String read) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < read.length(); i++) {

            char a = read.charAt(i);

            if (a == '(' || a == '[') {
                stack.push(a);

            } else if (a == ')') {

                if (stack.empty() || stack.peek() != '(') {
                    return "no";

                } else {
                    stack.pop();
                }

            } else if (a == ']') {
                if (stack.empty() || stack.peek() != '[') {
                    return "no";
                } else {
                    stack.pop();
                }
            }
        }
        if (stack.empty()) {
            return "yes";
        } else {
            return "no";
        }
    }
}
