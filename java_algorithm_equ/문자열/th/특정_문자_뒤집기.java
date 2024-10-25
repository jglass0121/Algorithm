package th;

import java.util.Scanner;

public class 특정_문자_뒤집기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(solution(str));
    }

    public static String solution(String str) {
        String answer = "";

        char[] s = str.toCharArray();
        int sf = 0, sl = str.length() - 1;
        while(sf < sl) {
            if(!Character.isAlphabetic(s[sf])) sf++;
            else if(!Character.isAlphabetic(s[sl])) sl--;
            else {
                char temp = s[sf];
                s[sf] = s[sl];
                s[sl] = temp;
                sf++;
                sl--;
            }
        }

        for (int i = 0; i < s.length; i++) {
            answer += s[i];
        }

        return answer;
    }
}
