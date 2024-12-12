import java.util.Scanner;

public class 괄호문자제거 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        solution(str);
    }

    private static void solution(String str) {

        int cnt = 0;
        String answer = "";
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if(cnt == 0 && c != '(' && c != ')' ){
                answer += c;
            }
            if (c == '(') {
                cnt++;
            }
            if(c == ')'){
                cnt--;

            }
        }
        System.out.println(answer);



    }
}
