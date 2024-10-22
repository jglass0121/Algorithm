import java.util.Scanner;

public class 대소문자변환 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String solution = solution(str);
        System.out.println(solution);

    }

    private static String solution(String str) {
        String answer = "";
        for(char s : str.toCharArray()){
            String getText = "" + s;
            if (Character.isUpperCase(s)) { // 대문자
                answer += getText.toLowerCase();
            } else { // 소문자
                answer += getText.toUpperCase();
            }

        }


        return answer;
    }
}
