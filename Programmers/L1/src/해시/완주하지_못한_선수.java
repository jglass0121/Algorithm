package 해시;

import java.util.HashMap;

public class 완주하지_못한_선수 {
    public static void main(String[] args) {
        String[] participant = {"leo", "kiki", "eden"};
        String[] completion = {"eden", "kiki"};

        String solution = solution(participant, completion);
        System.out.println("solution = " + solution);

    }

    private static String solution(String[] participant, String[] completion) {
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < participant.length; i++) {
            map.put(participant[i], map.getOrDefault(participant[i], 0) + 1);
        }

        for (int i = 0; i < completion.length; i++) {
            map.put(completion[i], map.getOrDefault(completion[i], 0) - 1);
        }

        for (String key : map.keySet()) {
            Integer value = map.get(key);
            if (value >=1) {

                return key;
            }
        }
        return null;
    }
}
