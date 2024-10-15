package L1;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class 정수내림차순 {
    public static void main(String[] args) {
        long n = 118372;
        solution(n);
    }

    private static void solution(long n) {
        String answer = "";
        String str = Long.toString(n);
        String[] split = str.split("");
        Arrays.sort(split, Collections.reverseOrder());
        System.out.println("Arrays.toString(split) = " + Arrays.toString(split));
        for (int i = 0; i < split.length; i++) {
            answer += split[i];
        }

        Long.parseLong(answer);

    }
}
