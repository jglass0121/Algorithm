package 골드6;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Point {
    int x, y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class 인구이동 {
    private static int N, L, R;
    private static int[][] map;
    private static boolean[][] visited;

    private static int[] dx = {-1, 0, 1, 0};
    private static int[] dy = {0, -1, 0, 1};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        N = scanner.nextInt();
        L = scanner.nextInt();
        R = scanner.nextInt();

        map = new int[N][N];
        visited = new boolean[N][N];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                map[i][j] = scanner.nextInt();
            }
        }

        int result = 0;

        while (true) {
            boolean moved = false;

            visited = new boolean[N][N];

            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    if (!visited[i][j]) {
                        if (bfs(i, j)) {
                            moved = true;
                        }
                    }
                }
            }

            if (!moved) {
                break;
            }

            result++;
        }

        System.out.println(result);

        scanner.close();
    }

    private static boolean bfs(int startX, int startY) {
        Queue<Point> queue = new LinkedList<>();
        Queue<Point> union = new LinkedList<>();

        queue.offer(new Point(startX, startY)); //이동 대상 큐
        union.offer(new Point(startX, startY)); //국가 영역 추적 큐

        visited[startX][startY] = true;

        int totalPopulation = map[startX][startY];
        int totalCountries = 1;

        while (!queue.isEmpty()) {
            Point current = queue.poll();

            for (int i = 0; i < 4; i++) {
                int nx = current.x + dx[i];
                int ny = current.y + dy[i];

                if (isValid(nx, ny) && !visited[nx][ny] && isInRange(map[current.x][current.y], map[nx][ny])) {
                    queue.offer(new Point(nx, ny));
                    union.offer(new Point(nx, ny));

                    visited[nx][ny] = true;
                    totalPopulation += map[nx][ny];
                    totalCountries++;
                }
            }
        }

        int averagePopulation = totalPopulation / totalCountries;

        //map Update
        while (!union.isEmpty()) {
            Point current = union.poll();
            map[current.x][current.y] = averagePopulation;
        }

        return totalCountries > 1;
    }

    private static boolean isValid(int x, int y) {
        return x >= 0 && x < N && y >= 0 && y < N;
    }

    private static boolean isInRange(int a, int b) {
        int diff = Math.abs(a - b);
        return diff >= L && diff <= R;
    }
}
