package L1;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class _거리두기_확인 {
    static int[] y = {1, 0, -1, 0};
    static int[] x = {0, 1, 0, -1};


    public static void main(String[] args) {
        String[][] places = {{"POOOP", "OXXOX", "OPXPX", "OOXOX", "POXXP"}, {"POOPX", "OXPXP", "PXXXO", "OXXXO", "OOOPP"}, {"PXOPX", "OXOXP", "OXPOX", "OXXOP", "PXPOX"}, {"OOOXX", "XOOOX", "OOOXX", "OXOOX", "OOOOO"}, {"PXPXP", "XPXPX", "PXPXP", "XPXPX", "PXPXP"}};
        System.out.println(Arrays.toString(solution(places)));
    }


    private static int[] solution(String[][] places) {
        int[] answer = new int[places.length];
        for (int i = 0; i < places.length; i++) {
            String[] p = places[i];
            boolean isOk = true;
            for (int r = 0; r < 5 && isOk; r++) {
                for (int c = 0; c < 5 && isOk; c++) {
                    if (p[r].charAt(c) == 'P') {
                        if (!bfs(r, c, p)) {
                            isOk = false;
                        }
                    }
                }
            }
            answer[i] = isOk ? 1 : 0;
        }
        return answer;
    }

    private static boolean bfs(int r, int c, String[] p) {
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{r, c});

        while (!queue.isEmpty()) {
            int[] position = queue.poll();
            for (int i = 0; i < 4; i++) {
                int nr = position[0] + y[i];
                int nc = position[1] + x[i];

                // 탐색 범위를 벗어나면 + 최초 출발점을 탐색에서 제외
                if (nr < 0 || nc < 0 || nr >= 5 || nc >= 5 || (nr == r && nc == c)) {
                    continue;
                }
                int d = Math.abs(nr - r) + Math.abs(nc - c); //맨해튼 거리

                // p가 맨해튼 거리 안에 있다면
                if (p[nr].charAt(nc) == 'P' && d <= 2) {
                    return false;
                } else if (p[nr].charAt(nc) == 'O' && d < 2) {
                    queue.add(new int[]{nr, nc});
                }
            }
        }
        return true;
    }

}
