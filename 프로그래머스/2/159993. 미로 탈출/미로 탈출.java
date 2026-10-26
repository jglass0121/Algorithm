import java.util.*;
class Solution {
    public int solution(String[] maps) {
        String[] le = maps[0].split("");
        String[][] arr = new String[maps.length][le.length];

        for (int i = 0; i < maps.length; i++) {
            String[] split = maps[i].split("");
            for (int j = 0; j < split.length; j++) {
                arr[i][j] = split[j];
            }
        }

        int bfs = bfs(arr);
        System.out.println("bfs = " + bfs);
        return bfs;
    }
    
        static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, -1, 0, 1};

    private static int bfs(String[][] arr) {
        //s 찾기
        int sx = -1;
        int sy = -1;
        int ex = -1;
        int ey = -1;
        int mx = -1;
        int my = -1;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j].equals("S")) {
                    sx = i;
                    sy = j;
                } else if (arr[i][j].equals("L")) { // 수정 1: "S"를 "L"로 변경
                    mx = i;
                    my = j;
                }
                if (arr[i][j].equals("E")) {
                    ex = i;
                    ey = j;
                }
            }
        }

        // 수정 2: 무한루프 방지를 위한 3차원 방문 배열 추가 (0: 레버 전, 1: 레버 후)
        boolean[][][] visited = new boolean[arr.length][arr[0].length][2];
        Queue<int[]> queue = new LinkedList<>();

        // 초기 레버 상태는 0(미획득)으로 큐에 넣습니다. (기존 -1에서 0으로 변경)
        queue.add(new int[]{sx, sy, 0, 0});
        visited[sx][sy][0] = true; // 시작점 방문 처리

        while (!queue.isEmpty()) {
            int[] now = queue.poll();

            if (now[3] == 1 && arr[now[0]][now[1]].equals("E")) {
                return now[2];
            }

            for (int i = 0; i < 4; i++) {
                int nx = now[0] + dx[i];
                int ny = now[1] + dy[i];

                // 수정 3: ny 범위를 세로(arr.length)가 아닌 가로(arr[0].length)와 비교
                if(nx < 0 || ny < 0 || nx >= arr.length || ny >= arr[0].length) continue;
                if (arr[nx][ny].equals("X")) continue;

                // 수정 4: now[3]을 직접 수정하지 않고, 다음 칸의 상태를 담을 변수 생성
                int nextLever = now[3];
                if(arr[nx][ny].equals("L")) nextLever = 1;

                // 아직 해당 레버 상태로 방문하지 않은 곳만 큐에 추가
                if (!visited[nx][ny][nextLever]) {
                    visited[nx][ny][nextLever] = true; // 방문 처리
                    queue.add(new int[]{nx, ny, now[2] + 1, nextLever});
                }
            }
        }
        return -1;
    }
}