package L1;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class 외톨이_알파벳 {
    public static void main(String[] args) {
        String input_string = "zbzbz";
        System.out.println(solution(input_string));
    }

    private static String solution(String inputString) {
        String[] split = inputString.split("");
        Arrays.sort(split);
        Set<String> set = new HashSet<>();
        for (int i = 0; i < split.length; i++) {
            set.add(split[i]);
        }


        String result = "";
        for (String s : set) {
            int find = 0;
            int change = 0;
            int idx = 0;
            for (int i = 0; i < inputString.length(); i++) {
                char c = inputString.charAt(i);
                if (s.equals("" + c)) {
                    find = 1;
                    idx++;

                    if (change == 1 && idx > 1) {
                        result += s;
                        break;
                    }


                } else { // 다른 경우
                    if (find == 1) {
                        change = 1; // 바뀐 부분
                    }
                }

            }

        }

        if (result == "") {
            result =  "N";
        }

        return result;




    }
}
