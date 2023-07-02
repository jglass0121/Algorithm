package _4장;

import java.util.HashMap;
import java.util.Set;

public class 숫자_문자열과_영단어2 {
    public static void main(String[] args) {
        String s = "one4seveneight";
        System.out.println(solution(s));

    }

    private static int solution(String s) {

        HashMap<String, Integer> map = new HashMap<String, Integer>();
        map.put("zero", 0);
        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);
        map.put("four", 4);
        map.put("five", 5);
        map.put("six", 6);
        map.put("seven", 7);
        map.put("eight", 8);
        map.put("nine", 9);

        for (String key : map.keySet()) {
            if (s.contains(key)) {
                 s = s.replaceAll(key, String.valueOf(map.get(key)));
            }

        }
        int  answer = Integer.parseInt(s);
        return answer;

    }
}
