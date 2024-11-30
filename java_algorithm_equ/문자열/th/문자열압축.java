package th;

import java.util.Scanner;

public class 문자열압축 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String arr = sc.nextLine();
        String solution = solution(arr);
        System.out.println(solution);
    }

    private static String solution(String s) {
        String answer = "";
        s = s + " "; // 마지막 비교를 위해  s.charAt(i + 1)
        System.out.println("s = " + s);
        int cnt = 1;
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == s.charAt(i + 1)) {
                cnt++;
            } else {
                answer += s.charAt(i);
                if (cnt > 1) {
                    answer += String.valueOf(cnt);
                }
                cnt = 1;
            }
        }

        return answer;

    }
}
