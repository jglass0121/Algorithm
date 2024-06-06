import java.util.*;

public class 뱀 {
    static int N; // 보드의 크기
    static int K; // 사과의 개수
    static int L; // 방향 변환 횟수
    static int[][] board; // 보드
    static Deque<int[]> snake = new ArrayDeque<>(); // 뱀의 몸을 저장할 덱
    static Map<Integer, String> directions = new HashMap<>(); // 방향 변환 정보를 저장할 맵
    static int[] dx = {0, 1, 0, -1}; // 동남서북
    static int[] dy = {1, 0, -1, 0}; // 동남서북

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        board = new int[N][N];

        K = sc.nextInt();
        for (int i = 0; i < K; i++) {
            int x = sc.nextInt() - 1;
            int y = sc.nextInt() - 1;
            board[x][y] = 1; // 사과 위치
        }

        L = sc.nextInt();
        for (int i = 0; i < L; i++) {
            int X = sc.nextInt();
            String C = sc.next();
            directions.put(X, C);
        }

        System.out.println(playGame());
    }

    static int playGame() {
        int time = 0;
        int direction = 0; // 초기 방향 동쪽
        snake.add(new int[]{0, 0});
        board[0][0] = 2; // 뱀의 초기 위치

        while (true) {
            time++;
            int[] head = snake.peekFirst();
            int nx = head[0] + dx[direction];
            int ny = head[1] + dy[direction];

            if (nx < 0 || nx >= N || ny < 0 || ny >= N || board[nx][ny] == 2) {
                // 벽에 부딪히거나 자기 자신과 부딪히면 종료
                break;
            }

            if (board[nx][ny] == 1) { // 사과가 있으면
                board[nx][ny] = 2; // 뱀의 몸이 됨
                snake.addFirst(new int[]{nx, ny});
            } else {
                // 사과가 없으면 이동
                board[nx][ny] = 2;
                snake.addFirst(new int[]{nx, ny});
                int[] tail = snake.pollLast();
                board[tail[0]][tail[1]] = 0; // 꼬리 부분을 비움
            }

            if (directions.containsKey(time)) {
                String c = directions.get(time);
                if (c.equals("L")) {
                    direction = (direction + 3) % 4; // 왼쪽 회전
                } else if (c.equals("D")) {
                    direction = (direction + 1) % 4; // 오른쪽 회전
                }
            }
        }

        return time;
    }
}
