package L1;

public class _약수의합 {
    public static void main(String[] args) {
        int n = 16;
        System.out.println(solution(n));
    }

    private static int solution(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                sum += i;

            }
        }
        return sum;
    }
}
