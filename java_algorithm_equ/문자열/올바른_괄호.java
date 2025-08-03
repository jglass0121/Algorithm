import java.util.Scanner;
import java.util.Stack;

//stack을 이용한 문제 해결
public class 올바른_괄호 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(solution(str));
    }

    private static String solution(String str) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == '(') {
                stack.add('(');
            } else {
                if(stack.size() == 0){
                    return "NO";
                }
                stack.pop();
            }

        }

        if(stack.size()!=0){
            return "NO";
        }
        return "YES";
    }
}
