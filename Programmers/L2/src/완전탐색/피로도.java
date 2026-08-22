package 완전탐색;

public class 피로도 {
    public static void main(String[] args) {
        int k = 80;
        int[][] dungeons = {
                {80, 20}, {50, 40}, {30, 10}
        };
        solution(k, dungeons);
    }

    private static int solution(int k, int[][] dungeons) {
        visited = new boolean[dungeons.length];
        back(k, dungeons, 0,0);
        return res;
    }

    static boolean[] visited;
    static int res;
    private static void back(int k, int[][] dungeons, int depth, int go) {
        if (depth == dungeons.length) {
            res = Math.max(go, res);
        }

        // 1 탐험 가능한가 ?
        for (int i = 0; i < dungeons.length; i++) {
            if (!visited[i]) {
                visited[i] = true;
                int canGo = dungeons[i][0];
                int down = dungeons[i][1];
                if (k >= canGo) {
                    back(k - down, dungeons, depth + 1, go+1);
                } else {
                    back(k - down, dungeons, depth + 1, go);

                }
                visited[i] = false;
            }
        }
    }
}
