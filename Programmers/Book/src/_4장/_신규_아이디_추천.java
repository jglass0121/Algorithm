package _4장;

import java.util.Scanner;

public class _신규_아이디_추천 {
    public static void main(String[] args) {
        String str ="...!@bat#*..y.abcdefghijklm";
        solution(str);

    }

    private static void solution(String str) {
        String answer = "";
        str= str.toLowerCase();
        answer =str.replaceAll("[^0-9a-z-_.]", "");
        answer=answer.replaceAll("[.]{2,}", ".");
        answer=answer.replaceAll("^[.]|[.]$", "");


        if (answer =="") {
            answer += "a";
        }

        if (answer.length() >= 16) {
            answer =  answer.substring(0, 15);
            answer = answer.replaceAll("^[.]|[.]$", "");
        }

        if (answer.length() <= 2) {
            String substring = answer.substring(answer.length() - 1);
            while (answer.length() < 3) {
                answer += substring;
            }

        }

        System.out.println("answer = " + answer);



    }

}
