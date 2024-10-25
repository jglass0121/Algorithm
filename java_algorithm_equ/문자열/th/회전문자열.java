package th;

import java.util.Scanner;

public class 회전문자열 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(solution(str));
    }

    private static String solution(String str) {
        String answer = "NO";
        String temp = new StringBuilder(str).reverse().toString();
        if(str.equalsIgnoreCase(temp))answer=  "YES";

        return answer;
    }
}
