package dfs_bfs;

public class 타겟넘버 {

    public static void main(String[] args) {
        int[] numbers = {4, 1, 2, 1};
        int target= 4;
        System.out.println(solution(numbers, target));
    }

    private static int solution(int[] numbers, int target) {
        dfs(numbers,0,target,0);
        return cnt;

    }

    static int cnt = 0;
    private static void dfs( int[] numbers,int depth, int target, int res) {
        if (depth == numbers.length) {
            if (target == res) {
                cnt++;
            }
            return;
        }

        int plus = res + numbers[depth];
        int minus = res - numbers[depth];

        dfs(numbers,depth+1,target,plus);
        dfs(numbers,depth+1,target,minus);
    }


}
