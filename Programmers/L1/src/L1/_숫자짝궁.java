package L1;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

public class _숫자짝궁 {
    public static void main(String[] args) {
        String X = "100";
        String Y = "203045";
        System.out.println(solution(X, Y));
    }

    private static String solution(String x, String y) {

        String[] split1 = x.split("");
        String[] split2 = y.split("");

        int[] visited = new int[10];

        for (int i = 0; i < visited.length; i++) {
            visited[i] = 0;
        }


        for (int i = 0; i < split1.length; i++) {
            int s = Integer.parseInt(split1[i]);
            visited[s] += 1;
        }


        Arrays.sort(split2, Collections.reverseOrder());
        StringBuilder answer = new StringBuilder();

        for (int i = 0; i < split2.length; i++) {
            int s = Integer.parseInt(split2[i]);
            if (visited[s] != 0) {
                answer.append(s);
                visited[s] -= 1;
            }

        }


        if (answer.length()== 0) {
            return "-1";
        } else if (answer.charAt(0) == '0') {
            return "0";
        } else {
            return answer.toString();
        }

    }
}
