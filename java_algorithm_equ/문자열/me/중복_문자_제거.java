package me;

import java.util.HashSet;
import java.util.Scanner;

public class 중복_문자_제거 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String string = sc.nextLine();
        String solution = solution(string);
        System.out.println(solution);
    }

    private static String solution(String str) {
        StringBuilder answer = new StringBuilder();  // 문자열을 효율적으로 만들기 위해 StringBuilder 사용
        HashSet<Character> set = new HashSet<>();    // 중복 여부를 확인할 HashSet

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            // HashSet에 없는 문자만 추가
            if (!set.contains(ch)) {
                set.add(ch);
                answer.append(ch);  // 중복되지 않은 문자는 answer에 추가
            }
        }

        return answer.toString();  // 최종 문자열 반환
    }
}
