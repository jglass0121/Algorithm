package th;

import java.util.Scanner;

public class 유효한_팰린드 {
    public static void main(String[] args) {
        //입력값을 받기 위한 스캐너
        Scanner sc = new Scanner(System.in);
        //입력값 한줄을 받음
        String str = sc.nextLine();

        //기본 답변을 NO로 지정
        String answer = "NO";

        //입력받은 문자열을 전부 대문자로 변환
        //정규식을 이용해 알파벳 대문자가 아니면 전부 없앰
        //정규식에서 ^는 부정을 의미함.
        str = str.toUpperCase().replaceAll("[^A-Z]" , "");

        //뒤집어도 같은지 확인하기 위해 임시로 뒤집은 문자열을 담는부분
        String tmp = new StringBuilder(str).reverse().toString();

        //뒤집은 문자열과 입력받은 문자열이 같으면 answer에 YES를 넣음
        if (str.equals(tmp)){
            answer = "YES";
            System.out.println(answer);
            //일치하지 않으면 answer(NO)를 출력
        } else {
            System.out.println(answer);
        }
    }}