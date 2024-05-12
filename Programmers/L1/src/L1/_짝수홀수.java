package L1;

public class _짝수홀수 {
    public static void main(String[] args) {
        int num = 4;
        System.out.println(solution(num));
        ;
    }

    private static String solution(int num) {
        if (num % 2 == 0) {
            return "Even";
        }
        return "Odd";

    }
}
