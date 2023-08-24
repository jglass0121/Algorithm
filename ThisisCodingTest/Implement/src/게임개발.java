import java.util.Scanner;

public class 게임개발 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int d = scanner.nextInt();

        int[][] map = new int[n][m];
        boolean[][] visited = new boolean[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                map[i][j] = scanner.nextInt();
            }
        }

        int[] dx = {-1, 0, 1, 0}; // 북, 동, 남, 서 순서로 이동
        int[] dy = {0, 1, 0, -1};

        int count = 1;
        visited[x][y] = true;

        while (true) {
            boolean moved = false;

            for (int i = 0; i < 4; i++) {
                d = (d + 3) % 4; // 왼쪽으로 회전
                int nx = x + dx[d];
                int ny = y + dy[d];

                if (nx >= 0 && nx < n && ny >= 0 && ny < m && map[nx][ny] == 0 && !visited[nx][ny]) {
                    visited[nx][ny] = true;
                    x = nx;
                    y = ny;
                    count++;
                    moved = true; //움직였음을 표시
                    break;
                }
            }

            if (!moved) { //움직임이 없을 경우
                int backX = x - dx[d];
                int backY = y - dy[d];

                if (backX >= 0 && backX < n && backY >= 0 && backY < m && map[backX][backY] == 0) {
                    x = backX;
                    y = backY;
                } else {
                    break;
                }
            }
        }

        System.out.println(count);
    }
}
