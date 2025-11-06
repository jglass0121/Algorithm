package L1;

import java.util.Arrays;
import java.util.HashMap;

public class 대충만든자판기 {
    public static void main(String[] args) {
        String[] keymap = {"ABACD", "BCEFD"};
        String[] targets = {"B"};
        int[] solution = solution(keymap, targets);
        System.out.println(Arrays.toString(solution));

    }

    private static int[] solution(String[] keymap, String[] targets) {
        HashMap<Character, Integer> map = new HashMap<>();
        
        // 더 작은 인덱스를 map에 넣기
        for (int i = 0; i < keymap.length; i++) {
            char[] keyChars = keymap[i].toCharArray();
            for (int j = 0; j < keyChars.length; j++) {
                // 해당 인덱스가 더 작은지 비교
                //해당 키가 있는가 ?
                if (map.containsKey(keyChars[j])) {
                    // 인덱스를 비교하여 더 작은 인덱스를 put
                    Integer prevIndex = map.get(keyChars[j]);
                    if (prevIndex > j) {
                        map.put(keyChars[j], j+1);
                    }
                } else {
                    map.put(keyChars[j], j+1);
                }
            }
        }

        //target 계산
        int sum = 0;
        int[] answer = new int[targets.length];
        for (int i = 0; i < targets.length; i++) {
            sum = 0;
            String target = targets[i];
            char[] targetChar = target.toCharArray();

            for (int j = 0; j < targetChar.length; j++) {
                char key = targetChar[j];
                sum+=map.getOrDefault(key, -1);

                if (!map.containsKey(key)) {
                    sum = -1;
                    break;
                }
                if (map.containsKey(key)) {
                    sum += map.get(key);
                }
            }

            answer[i] = (sum == -1) ? -1 : sum;
        }

        return answer;
    }
}
