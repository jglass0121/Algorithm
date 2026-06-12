package DFS_BFS;

public class 타겟넘버 {
    public static void main(String[] args) {
        int[] numbers = {1, 1, 1, 1, 1};
        int target = 3;
        solution(numbers, target);
    }

    static int cnt = 0;

    private static void solution(int[] numbers, int target) {
        dfs(numbers, target, 0, 0);
        System.out.println("cnt = " + cnt);
    }

    private static void dfs(int[] numbers, int target, int depth, int sum) {
        if (depth == numbers.length) {
            if (sum == target) {
                cnt++;
            }
            return;
        }

        dfs(numbers, target, depth + 1, sum + numbers[depth]);
        dfs(numbers, target, depth + 1, sum - numbers[depth]);
    }
}
