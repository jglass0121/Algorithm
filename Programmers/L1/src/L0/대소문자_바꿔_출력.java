package L0;

import java.util.Scanner;

public class 대소문자_바꿔_출력 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();


        String result = "";



        for (int i = 0; i < a.length(); i++) {
            int b = (int) a.charAt(i);
            if (b >= 97 && b <= 122) { // 소문자
                char s = (char) ((char) b-32);
                result+=s;

            } else { //대문자
                char s = (char) ((char)b+32);
                result+=s;
            }

        }
        System.out.println("최종 = " + result);

    }
}
