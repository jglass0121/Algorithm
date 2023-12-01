package L3;

import org.w3c.dom.Node;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class _경주로_건설 {

    public static void main(String[] args) {
        int[][] board = {
                {0, 0}
                , {0, 0
        }};

        System.out.println(solution(board));

    }

    private static final int INF = 987654321;
    private static final int[] dx = {0, 0, 1, -1}; // 상하좌우
    private static final int[] dy = {1, -1, 0, 0};


    public static int solution(int[][] board) {
        int n = board.length;
        int[][][] cost = new int[n][n][4]; // 각 칸까지의 최소 비용을 저장하는 배열


        // 초기화
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                Arrays.fill(cost[i][j], INF);
            }
        }

        System.out.println(Arrays.deepToString(cost));

        // 시작 지점 초기화
        for (int i = 0; i < 4; i++) {
            cost[0][0][i] = 0;
        }
        System.out.println("-----------");

        System.out.println(Arrays.deepToString(cost));


        // 우선순위 큐를 이용한 다익스트라 알고리즘
        PriorityQueue<Node> pq = new PriorityQueue<>();
        pq.add(new Node(0, 0, -1, 0)); //초기에는 이전 방향이 없어 -1

        while (!pq.isEmpty()) {
            Node current = pq.poll();

            for (int i = 0; i < 4; i++) {
                int nx = current.x + dx[i];
                int ny = current.y + dy[i];

                if (nx >= 0 && nx < n && ny >= 0 && ny < n && board[nx][ny] == 0) {
                    int newCost = current.cost + (current.dir == -1 || current.dir == i ? 100 : 600); //현재 돈+ 방향(같은지,다른지)
                    for (int[][] matrix2D : cost) {
                        for (int[] row : matrix2D) {
                            for (int value : row) {
                                System.out.print(value + " ");
                            }
                            System.out.println();
                        }
                        System.out.println("====================");
                    }

                    if (newCost < cost[nx][ny][i]) {
                        cost[nx][ny][i] = newCost;
                        pq.add(new Node(nx, ny, i, newCost));
                    }
                }
            }
        }

        // 최소 비용 중 최솟값 반환
        int answer = INF;
        for (int i = 0; i < 4; i++) {
            int b = cost[n - 1][n - 1][i];
            System.out.println("b = " + b);
            answer = Math.min(answer, b);
        }


        System.out.println(Arrays.deepToString(cost));

        return answer;
    }

    static class Node implements Comparable<Node> {
        int x, y, dir, cost;

        public Node(int x, int y, int dir, int cost) {
            this.x = x;
            this.y = y;
            this.dir = dir;
            this.cost = cost;
        }

        @Override
        public int compareTo(Node o) {
            return this.cost - o.cost;
        }
    }
}
