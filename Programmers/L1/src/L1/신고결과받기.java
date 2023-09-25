package L1;

import com.sun.source.doctree.SeeTree;

import java.util.*;

public class 신고결과받기 {
    public static void main(String[] args) {
        String[] id_list = {
                "muzi", "frodo", "apeach", "neo"};

        String[] report = {
                "muzi frodo", "apeach frodo", "frodo neo", "muzi neo", "apeach muzi"};

        int k = 2;


        solution(id_list, report, k);

    }

    private static int[] solution(String[] idList, String[] report, int k) {
        int[] answer = new int[idList.length];
        Map<String, HashSet<String>> map = new HashMap<>();
        Map<String, Integer> idxMap = new HashMap<>();

        for (int i = 0; i < idList.length; i++) {
            String name = idList[i];
            map.put(name, new HashSet<>()); //hashset초기화 시켜준다.
            idxMap.put(name, i);
        }

        for (int i = 0; i < report.length; i++) {
            String key = report[i].split(" ")[0]; //신고자
            String value = report[i].split(" ")[1]; //가해자
            map.get(value).add(key);
        }

        System.out.println("map = " + map);

        for (int i = 0; i < idList.length; i++) {
            HashSet<String> send = map.get(idList[i]);
            if (send.size() >= k) { //hashSet의 size가 제한수를 넘을 경우
                for (String name : send) {
                    answer[idxMap.get(name)]++;
                }
            }
        }
        return answer;
    }
}
