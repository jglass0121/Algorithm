package L1;

public class 수박 {
    public static void main(String[] args) {
        int n = 4;
        String solution = solution(n);
        System.out.println("solution = " + solution);
    }

    private static String solution(int n) {

        String answer = "";
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                answer += "수";
            } else {
                answer += "박";
            }
        }

        return answer;

    }
}
