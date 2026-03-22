import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < num; i++) {
            String str = sc.nextLine();
            Stack<Character> stack = new Stack<>();
            boolean isRight = true;
            for (int j = 0; j < str.length(); j++) {
                char c = str.charAt(j);
                if (c == '(') {
                    stack.add('(');
                }
                if (c == ')') {
                    if (stack.isEmpty()) {
                        isRight = false;
                        break;
                    }
                    stack.pop();
                }
            }

            if (!stack.isEmpty()) {
                isRight = false;
            }

            if (isRight) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

    }
}
