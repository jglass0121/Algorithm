package _14장;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.stream.Collectors;

public class _외톨이_알파벳 {
    public static void main(String[] args) {
        String input_string ="zbzbz";
        solution(input_string);
    }

    private static void solution(String inputString) {
        //2개 이상인 경우 . 연속인지 , 마지막에 Sort로
        HashMap<Character, Integer> map = new HashMap<>();

        char prev = inputString.charAt(0);
        map.put(prev, map.getOrDefault(inputString.charAt(0), 0) + 1);
        LinkedList<Character> list = new LinkedList<>();

        for (int i = 1; i < inputString.length(); i++) {

            char key = inputString.charAt(i);

            if (map.containsKey(key) && !list.contains(key)) {
                if (prev != key ) { // 서로 다름 = 2개 이상이라는뜻
                    list.add(key);
                }
            }
            map.put(key, map.getOrDefault(inputString.charAt(i), 0) + 1);
            prev= key;
        }


        Collections.sort(list);
        StringBuilder sb = new StringBuilder();
        if (list.size() != 0) {
            for (int i = 0; i < list.size(); i++) {
                sb.append(list.get(i));
            }
        }else{
            sb.append("N");
        }


        System.out.println(sb);

    }
}
