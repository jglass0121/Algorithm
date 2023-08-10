package _7장;


import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class _문자열_내림차순으로_배치하기 {
    public static void main(String[] args) {
        String s = "Zbcdefg";
        System.out.println(solution(s));

    }

    private static String solution(String s) {
        char[] charArray = s.toCharArray();
        System.out.println("charArray.toString() = " + Arrays.toString(charArray));
        Arrays.sort(charArray);
        //new String : char배열을 String으로 변환해준다.
        return new StringBuilder(new String(charArray)).reverse().toString();
    }
}
