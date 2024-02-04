package String;

import java.util.Arrays;

public class ReverseWordsInaString {
    public static void main(String[] args) {
        String s = "a good   example";
        solution(s);
    }


    private static String solution(String s) {
        String[] split = s.split("\\s+");
        StringBuilder reversed = new StringBuilder();
        for (int i = split.length - 1; i >= 0; i--) {
            reversed.append(split[i]).append(" ");
        }
        String trim = reversed.toString().trim();
        System.out.println("trim = " + trim);

        return trim;
    }
}
