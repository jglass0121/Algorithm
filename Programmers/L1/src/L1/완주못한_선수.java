package L1;

import java.util.HashMap;
import java.util.List;

public class 완주못한_선수 {
    public static void main(String[] args) {
        String[] participant = {"leo", "kiki", "eden"};
        String[] completion = {"eden", "kiki"};
        solution(participant, completion);

    }

    private static String solution(String[] participant, String[] completion) {


        HashMap<String, Integer> map = new HashMap<>();
        for (String s : participant) {
            map.put(s, map.getOrDefault(s,0) + 1);
        }

        for (String s : completion) {
            map.put(s, map.getOrDefault(s,0) - 1);
        }


        for (String s : map.keySet()) {
            Integer value = map.get(s);
            if (value > 0) {
                return s;
            }
        }

        return "";
    }
}
