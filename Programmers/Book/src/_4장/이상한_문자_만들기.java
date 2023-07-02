package _4장;

import java.util.StringTokenizer;

public class 이상한_문자_만들기 {
    public static void main(String[] args) {
        String s = "try hello world";
        System.out.println(solution(s));
    }

    private static String solution(String s) {
        String[] split = s.split("");
        String answer = "";

        int idx = 0;
        for (int i = 0; i < split.length; i++) {

            if (split[i].equals(" ")) {
                idx = 0;
            } else if (idx % 2 == 0) {
                split[i] = split[i].toUpperCase();
                idx++;
            } else if (idx % 2 != 0) {
                split[i] = split[i].toLowerCase();
                idx++;
            }
            answer += split[i];
        }
        return answer;

    }
}
