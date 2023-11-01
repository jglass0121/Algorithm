package L1;

import java.util.LinkedList;

public class 콜라문제 {
    public static void main(String[] args) {
        int a = 3;
        int b = 1;
        int n = 20;
        System.out.println(solution(a, b, n));


    }

    private static int solution(int a, int b, int n) {
        int answer = 0;
        while (true) {
            if (n < a) {
                break;
            }
            answer += (n / a) * b;
            int remainer = n % a;
            n = (n / a) * b + remainer;
        }
        return answer;
    }
}
