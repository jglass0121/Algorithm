package DFS_BFS;

import java.util.HashSet;

public class 소수_찾기 {
    public static void main(String[] args) {
        String numbers = "011";
        solution(numbers);
    }

    private static int solution(String numbers) {
        String[] arr = numbers.split("");
        visited = new boolean[numbers.length()];
        dfs(arr, 0, "");
        return set.size();

    }

    static boolean[] visited;
    static HashSet<Integer> set = new HashSet<>();

    private static void dfs(String[] arr, int depth, String res) {
        if (arr.length == depth) {
            if (res == "") {
                return;
            }
            int transInt = Integer.parseInt(res);
            if(isPrime(transInt)){
                set.add(transInt);
            }
            return;
        }

        for (int i = 0; i < arr.length; i++) {
            if (!visited[i]) {
                visited[i] = true;
                dfs(arr, depth + 1, res + arr[i]);
                dfs(arr, depth + 1, res);
                visited[i] = false;

            }

        }

    }

    private static boolean isPrime(int val) {
        if(val < 2) return false;

        for (int i = 2; i <= Math.sqrt(val); i++) {
            if(val % i == 0) return false;
        }
        return true;
    }
}
