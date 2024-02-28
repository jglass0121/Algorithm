package dfs_bfs;

public class 타겟넘버 {
    public static void main(String[] args) {
        int[] numbers = {1, 1, 1, 1, 1};
        int target = 3;
        System.out.println(solution(numbers, target));
    }

    private static int solution(int[] numbers, int target) {

        fac(numbers, 0, target,0);

        return res;

    }

    static int res = 0;

    private static void fac(int[] numbers, int deth, int target, int sum) {
        if (deth == numbers.length) {
            if (target == sum) {
                res++;
            }
            return;
        }

        fac(numbers, deth + 1, target, sum + numbers[deth]);
        fac(numbers, deth + 1, target, sum - numbers[deth]);

    }
}
