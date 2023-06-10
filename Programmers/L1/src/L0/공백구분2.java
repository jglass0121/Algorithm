package L0;

import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class 공백구분2
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(Arrays.toString(solution(s)));
        //과일 장수

    }

    private static String[] solution(String my_string) {
        StringTokenizer st = new StringTokenizer(my_string);
        String[] answer = new String[st.countTokens()];
        int i = 0;
        while (st.hasMoreTokens()) {
            answer[i] = st.nextToken();
            i++;
        }
        return answer;
    }
}
