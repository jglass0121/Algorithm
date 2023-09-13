package _4장;

import java.util.*;

public class _중복문자 {
    public static void main(String[] args) {
        String my_string = "We are the world";
        solution(my_string);

    }

    private static String solution(String myString) {
        String[] split = myString.split("");

        LinkedList<String> list = new LinkedList<>();
        //비교 후 cont
        for (int i = 0; i < split.length; i++) {
            if (!list.contains(split[i])) {
                list.add(split[i]);
            }
            continue;
        }

        String answer = "";
        for (int i = 0; i < list.size(); i++) {
         answer+=list.get(i);
        }
        return answer;

    }
}
