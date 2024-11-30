import java.util.Scanner;

public class 문자열압축 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String next = sc.nextLine();
        String solution = solution(next);
        System.out.println(solution);
    }

    private static String solution(String array) {
        char[] charArray = array.toCharArray();
        int cnt = 1;
        char now = charArray[0];
        StringBuilder sb = new StringBuilder();

        for (int i = 1; i < charArray.length; i++) {
            char next = charArray[i];

            if (now == next) {
                cnt++;
                continue;
            }
            //다른 경우
            if (cnt > 1) { // 1보다 클 경우,
                sb.append(now).append(cnt);
            } else {
                sb.append(now);

            }
            cnt = 1;
            now = next;
        }


        // 마지막 문자 처리
        if (cnt > 1) {
            sb.append(now).append(cnt);
        } else {
            sb.append(now);
        }



        return sb.toString();


    }
}
