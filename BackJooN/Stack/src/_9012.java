import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class _9012 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());

        for (int i = 0; i < num; i++) {
            String solution = solution(br);
            System.out.println( solution);


        }


    }

    private static String solution(BufferedReader br) throws IOException {
        String result = br.readLine();
        Stack stack = new Stack<>();

        for (int j  = 0; j < result.length(); j++) {
            char c = result.charAt(j);
            switch (c) {
                case '(':
                    stack.push(c);
                    break;
                case ')':
                    if (stack.size() == 0) {
                        return "NO";
                    } else {
                        stack.pop();
                    }

                    break;
            }
        }
        if (stack.size() == 0) {
            return  "YES";
        } else {
            return  "NO";
        }
    }
}
