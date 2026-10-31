package DFS_BFS;

import java.util.LinkedList;
import java.util.Queue;

public class 미로탈출 {
    public static void main(String[] args) {
        String[] maps = {"SOOOL", "XXXXO", "OOOOO", "OXXXX", "OOOOE"};
        System.out.println("최단 시간 = " + solution(maps));
    }

    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};

    private static int solution(String[] maps) {
        String[] split = maps[0].split("");
        String[][] arr = new String[maps.length][split.length];
        int startX = 0, startY = 0;
        int leverX = 0, leverY = 0;

        // 1. 시작점(S)과 레버(L) 위치 동시에 찾기
        for (int i = 0; i < maps.length; i++) {
            String[] mapSplit = maps[i].split("");
            for (int j = 0; j < mapSplit.length; j++) {
                arr[i][j] = mapSplit[j];
                if (arr[i][j].equals("S")) {
                    startX = i;
                    startY = j;
                } else if (arr[i][j].equals("L")) {
                    leverX = i;
                    leverY = j;
                }
            }
        }

        // 2. BFS 두 번 실행
        // 첫 번째: 시작점(S) -> 레버(L)
        int toLever = bfs(arr, startX, startY, "L");
        if (toLever == -1) return -1; // 레버에 도달할 수 없으면 바로 -1 반환

        // 두 번째: 레버(L) -> 출구(E)
        int toExit = bfs(arr, leverX, leverY, "E");
        if (toExit == -1) return -1; // 출구에 도달할 수 없으면 바로 -1 반환

        // 두 거리를 합산
        return toLever + toExit;
    }

    // 3. 목표 지점(target)을 매개변수로 받아 재사용할 수 있는 BFS
    private static int bfs(String[][] arr, int startX, int startY, String target) {
        Queue<int[]> queue = new LinkedList<>();
        // 큐에는 {x좌표, y좌표, 현재까지 이동 거리}를 넣습니다.
        queue.add(new int[]{startX, startY, 0});

        // 원본 배열(arr)을 숫자로 덮어씌우지 않기 위해 방문 체크 배열을 씁니다.
        boolean[][] visited = new boolean[arr.length][arr[0].length];
        visited[startX][startY] = true;

        while (!queue.isEmpty()) {
            int[] now = queue.poll();
            int x = now[0];
            int y = now[1];
            int dist = now[2];

            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];

                // 맵을 벗어나거나 벽("X")인 경우 통과
                if (nx < 0 || ny < 0 || nx >= arr.length || ny >= arr[0].length) continue;
                if (arr[nx][ny].equals("X")) continue;

                // 목표 지점(target)을 찾으면 현재 거리 + 1 반환
                if (arr[nx][ny].equals(target)) {
                    return dist + 1;
                }

                // 아직 방문하지 않은 길이면 큐에 추가
                if (!visited[nx][ny]) {
                    visited[nx][ny] = true;
                    queue.add(new int[]{nx, ny, dist + 1});
                }
            }
        }
        return -1; // 목표를 찾지 못하고 큐가 비면 도달 불가(-1)
    }
}