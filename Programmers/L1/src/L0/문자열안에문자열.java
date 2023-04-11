package L0;

import java.util.Scanner;

public class 문자열안에문자열 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();

        int solution = solution(str1, str2);
        System.out.println("solution = " + solution);


    }
    public static int solution(String str1, String str2) {
        int answer = 0;

        if(str1.contains(str2)) {
            return answer=1;
        }else {
            return answer=2;

        }


}
}
