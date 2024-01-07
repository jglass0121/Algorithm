package queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingDeque;

public class 올바른_괄호 {
    public static void main(String[] args) {
        String s = "(()(";
        System.out.println(solution(s));
        ;
    }

    private static boolean solution(String s) {

        Queue<Character> queue = new LinkedList<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(') {
                queue.add('(');
            } else {
                if (!queue.isEmpty()) {
                    queue.poll();
                } else {
                    return false;
                }

            }
        }


        return queue.isEmpty() ? true : false;
    }
}
