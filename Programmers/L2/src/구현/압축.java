package 구현;

import java.util.ArrayList;
import java.util.HashMap;

public class 압축 {
    public static void main(String[] args) {
        String msg = "KAKAO";
        System.out.println("res = " + solution(msg));
    }

    private static ArrayList<Integer> solution(String msg) {
        HashMap<String, Integer> map = new HashMap<>();

        // 1. 길이가 1인 모든 단어를 포함하도록 사전을 초기화한다.
        for (int i = 0; i < 26; i++) {
            String str = String.valueOf((char)('A' + i));
            map.put(str, i + 1);
        }

        ArrayList<Integer> res = new ArrayList<>();
        int dictIdx = 27; // 다음에 사전에 추가될 단어의 색인 번호
        int i = 0;        // 현재 메시지 탐색 인덱스

        while (i < msg.length()) {
            String w = "";

            // 2. 사전에서 현재 입력과 일치하는 가장 긴 문자열 w를 찾는다.
            while (i < msg.length() && map.containsKey(w + msg.charAt(i))) {
                w += msg.charAt(i);
                i++;
            }

            // 3. w에 해당하는 사전의 색인 번호를 출력한다.
            res.add(map.get(w));

            // 4. 입력에서 처리되지 않은 다음 글자가 남아있다면(c), w+c에 해당하는 단어를 사전에 등록한다.
            if (i < msg.length()) {
                map.put(w + msg.charAt(i), dictIdx++);
            }
        }

        return res;
    }
}