package DFS_BFS;

import java.util.LinkedList;
import java.util.Queue;

public class 게임맵_최단거리 {
    public static void main(String[] args) {
        int[][] map = {
                {1, 0, 1, 1, 1},
                {1, 0, 1, 0, 1},
                {1, 0, 1, 1, 1},
                {1, 1, 1, 0, 1}, {0, 0, 0, 0, 1}
        };

        solution(map);

    }

    static int[] dx = {-1, 0, 0, 1};
    static int[] dy = {0, 1, -1, 0};

    private static int solution(int[][] map) {
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{0, 0});
        map[0][0] = 1;
        int answer = -1;
        while (!queue.isEmpty()) {
            int[] now = queue.poll();
            int x = now[0];
            int y = now[1];

            if (x == map.length - 1 && y == map[0].length - 1){
                return answer = map[x][y];
            }

            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];


                if (nx < 0 || ny < 0 || nx >= map.length || ny >= map[0].length) {
                    continue;
                }

                if (map[nx][ny] == 1) {
                    map[nx][ny] = map[x][y] + 1;
                    queue.add(new int[]{nx, ny});

                }
            }
        }

        return answer;



    }
}
