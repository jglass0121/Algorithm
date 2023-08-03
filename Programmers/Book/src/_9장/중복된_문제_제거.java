package _9장;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;

public class 중복된_문제_제거 {
    public static void main(String[] args) {
        String my_string = "We are the world";
        solution(my_string);

    }

    private static String  solution(String myString) {
        HashMap<Character, Integer> map = new LinkedHashMap();

        String answer = "";
        String[] split = myString.split("");
        for (int i = 0; i < split.length; i++) {
            char s = split[i].charAt(0);
            if (!map.containsKey(s)) {
                map.put(s, 1);
                answer+=s;
            }
        }
        return answer;
    }
}
