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

    private static void solution(String[] idList, String[] report, int k) {
        HashMap<String, LinkedList<String>> map = new HashMap<>();

        for (int i = 0; i < report.length; i++) {
            String key = report[i].split(" ")[0];
            String value = report[i].split(" ")[1];
            LinkedList<String> str = new LinkedList<>();
            str.add(value);
            map.put(key, str);
        }

        System.out.println("map = " + map);

    }
}
