import java.util.Scanner;

public class 숫자만_추출 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(solution(str));


    }

    private static int solution(String str) {

        String res = "";
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (Character.isDigit(c)) {
                res += "" + c;
            }
        }
        return Integer.parseInt(res);

    }
}
