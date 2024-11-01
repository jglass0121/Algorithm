package DFS_BFS;

public class 네트워크 {
    public static void main(String[] args) {
        int n = 3;
        int[][] computers = {
                {1, 1, 0}, {1, 1, 0}, {0, 0, 1}
        };

        int solution = solution(n, computers);
        System.out.println(solution);

    }

    private static int solution(int n, int[][] computers) {
        int answer = 0;
        boolean[] check = new boolean[n];

        for (int i = 0; i < n; i++) {
            if (!check[i]) {
                System.out.println(i);
                dfs(computers, i, check);
                answer++;
            }
            System.out.println();
        }

        return answer;

    }

    private static boolean[] dfs(int[][] computers, int i, boolean[] check) {
        check[i] = true;

        for (int j = 0; j < computers.length; j++) {
            System.out.println(j);
            if (i != j && computers[i][j] == 1 && check[j] == false) {
                check = dfs(computers, j, check);
            }
        }
        return check;
    }
}
