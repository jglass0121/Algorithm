package th;

import java.util.Scanner;

class 중복_문자_제거 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String string = sc.nextLine();
        String solution = solution(string);
        System.out.println(solution);
    }

    private static String solution(String str) {
        String answer = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.indexOf(str.charAt(i)) == i) { //This method returns the first index at which the character
                answer += str.charAt(i);
            }
        }

        return answer;
    }
}
