package _9장;

import java.util.*;
import java.util.stream.Collectors;

public class 완주하지_못한_선수 {
    public static void main(String[] args) {
        String[] participant = {"mislav", "stanko", "mislav", "ana"};
        String[] completion = {"stanko", "ana", "mislav"};
        System.out.println(solution(participant, completion));

    }

    private static String solution(String[] participant, String[] completion) {
        HashMap<String, Integer> map = new LinkedHashMap<>();
        for (String p: participant) {
            map.put(p, map.getOrDefault(p, 0) + 1);
        }
        for (String c :
                completion) {
            map.put(c, map.get(c) - 1);
        }
        String answer = "";
        for (String key :
                map.keySet()) {
            if (map.get(key) != 0) {
                answer = key;
            }
        }
        return answer;
    }
}
