package _7장;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class 가장큰수 {
    public static void main(String[] args) {
        int[] numbers = {3, 30, 34, 5, 9};
        solution(numbers);

    }

    private static String solution(int[] numbers) {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < numbers.length; i++) {
            int number = numbers[i];
            String s = "" + number;
            char c = s.charAt(0);
            String s1 = c + s;
            list.add(s1);
        }

        Collections.sort(list,Collections.reverseOrder());
        String answer = "";
        for (int i = 0; i < list.size(); i++) {
            String substring = list.get(i).substring(1);
            answer += substring;

        }

        return answer;

    }
}
