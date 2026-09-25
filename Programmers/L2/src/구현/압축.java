package 구현;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class 압축 {
    public static void main(String[] args) {
        String msg = "KAKAO";
        int[] result = solution(msg);
        System.out.println("결과 = " + Arrays.toString(result));
    }

    public static int[] solution(String msg) {
        // 1. 길이가 1인 모든 단어를 포함하도록 사전을 초기화한다.
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < 26; i++) {
            map.put(String.valueOf((char) ('A' + i)), i + 1);
        }

        ArrayList<Integer> res = new ArrayList<>();
        int nextIdx = 27; // 다음 사전에 등록될 단어의 색인 번호
        int i = 0;        // 현재 읽고 있는 문자열의 위치

        while (i < msg.length()) {
            String w = "";

            // 2. 사전에서 현재 입력과 일치하는 가장 긴 문자열 w를 찾는다.
            while (i < msg.length() && map.containsKey(w + msg.charAt(i))) {
                w += msg.charAt(i);
                i++;
            }

            // 3. w에 해당하는 사전의 색인 번호를 출력한다.
            res.add(map.get(w));

            // 4. 입력에서 처리되지 않은 다음 글자가 남아있다면(c), w+c를 사전에 등록한다.
            if (i < msg.length()) {
                map.put(w + msg.charAt(i), nextIdx++);
            }
        }

        // List를 int 배열로 변환하여 반환
        return res.stream().mapToInt(Integer::intValue).toArray();
    }
}