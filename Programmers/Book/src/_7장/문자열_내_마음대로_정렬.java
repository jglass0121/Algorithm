package _7장;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class 문자열_내_마음대로_정렬 {
    public static void main(String[] args) {
        String[] strings = {"sun", "bed", "car"};
        int n = 1;
        String[] strings1 = strings;
        String[] solution = solution(strings1, n);
        System.out.println(Arrays.toString(solution));
    }

    private static String[] solution(String[] strings, int n) {
        String[] answer = new String[strings.length];
        ArrayList<String> list = new ArrayList<>();

        for (int i = 0; i < strings.length; i++) {
            list.add(strings[i].charAt(n) + strings[i]);
        }

        Collections.sort(list);

        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i).substring(1);
        }
        return answer;
    }
}
