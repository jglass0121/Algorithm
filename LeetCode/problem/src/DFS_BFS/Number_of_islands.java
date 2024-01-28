package DFS_BFS;

public class Number_of_islands {
    public static void main(String[] args) {
        String[][] grid = {
                {"1", "1", "0", "0", "0"},
                {"1", "1", "0", "0", "0"},
                {"0", "0", "1", "0", "0"},
                {"0", "0", "0", "1", "1"}
        };

        solution(grid);

    }

    private static int solution(String[][] grid) {

        int cnt = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {  // 수정된 부분
                if (grid[i][j] == "1") {
                    fac(i, j, grid);
                    cnt++;
                }
            }
        }

        System.out.println("cnt = " + cnt);

        return cnt;

    }

    static int[] dy = {1, 0, -1, 0};
    static int[] dx = {0, 1, 0, -1};

    private static void fac(int i, int j, String[][] grid) {

        grid[i][j] = "0";

        for (int k = 0; k < 4; k++) {
            int ny = i + dy[k];
            int nx = j + dx[k];
            if (ny >= 0 && nx >=0 && ny < grid.length && nx < grid.length) {
                if (grid[ny][nx] == "1") {
                    fac(ny, nx, grid);
                }
            }




        }


    }
}
