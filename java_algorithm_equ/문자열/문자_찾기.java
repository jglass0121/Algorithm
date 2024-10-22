import java.util.Scanner;

public class 문자_찾기
{
    public static void  main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input1 = sc.nextLine();
        String input2 = sc.next();
        int solution = solution(input1, input2);
        System.out.println("solution = " + solution);

    }

    private static int solution(String input1, String input2) {

        int answer = 0;
        String lowerCase = input1.toLowerCase();
        String lowerCase2 = input2.toLowerCase();
        for (int i = 0; i < input1.length(); i++) {
            String anObject =""+ lowerCase.charAt(i);
            if (lowerCase2.equals(anObject)) {
                answer++;
            }
        }

        return answer;
    }
}
