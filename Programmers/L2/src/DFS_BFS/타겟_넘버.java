package DFS_BFS;

public class 타겟_넘버 {
    public static void main(String[] args) {
        int[] numbers = {1, 1, 1, 1, 1};
        int target = 3;
        solution(numbers, target);

    }

    private static int solution(int[] numbers, int target) {

        dfs(numbers, 0, 0, target);
        System.out.println("answer = " + answer);
        return answer;
    }

    static int answer = 0;
    private static void dfs(int[] numbers, int depth, int sum, int target) {
        if (depth == numbers.length) {
            if (sum == target) {
                answer++;
            }
            return;
        }

        dfs(numbers, depth + 1,sum+ numbers[depth] , target);
        dfs(numbers, depth + 1,+ sum -numbers[depth] , target);
    }
}
