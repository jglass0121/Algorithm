package L0;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 문자열밀기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String A = br.readLine();
        String B = br.readLine();
        System.out.println(solution(A, B));
    }
        public static int solution(String a, String b) {
            int answer = 0;
            String copy = a;
            for (int i = 0; i < copy.length(); i++) {
                if (copy.equals(b)) {
                    return answer;
                }
                String end = copy.substring(copy.length() - 1);
                System.out.println("end = " + end);

                copy = end + copy.substring(0, copy.length() - 1);
                System.out.println("end = " + end);
                System.out.println(" ==================== " );
                answer++;
            }
            return -1;



//            String tempB = b.repeat(3);
//            System.out.println("tempB = " + tempB);
//            return tempB.indexOf(a);
        }
}
