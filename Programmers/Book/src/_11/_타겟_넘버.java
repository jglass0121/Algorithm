package _11;

public class _타겟_넘버 {
    public static void main(String[] args) {
        int[] numbers = {4, 1, 2, 1};
        int target =2;
        solution(numbers, target);
    }

    private static void solution(int[] numbers, int target) {
        fac(0, 0, numbers, target);
        System.out.println(cnt);
    }

    static int cnt = 0;

    private static void fac(int depth, int sum, int[] numbers, int target) {
        if (depth == numbers.length) {
            if (target == sum) {
                cnt++;
            }

            return;
        }

        // 더한 값
        fac(depth + 1, sum + numbers[depth], numbers, target);
        fac(depth + 1, sum - numbers[depth], numbers, target);
    }
}
