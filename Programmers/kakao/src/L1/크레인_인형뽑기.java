package L1;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class 크레인_인형뽑기 {
    public static void main(String[] args) {
        int[][] board = {{0, 0, 0, 0, 0}, {0, 0, 1, 0, 3}, {0, 2, 5, 0, 1}, {4, 2, 4, 4, 2}, {3, 5, 1, 3, 1}};
        int[] move = {1, 5, 3, 5, 1, 2, 1, 4};
        System.out.println(solution(board, move));

    }

    private static int solution(int[][] board, int[] move) {
        Stack<Integer> queue = new Stack<>();
        int cnt = 0;
        for (int i = 0; i < move.length; i++) {
            int x = move[i] - 1;

            for (int j = 0; j < board.length; j++) {
                int val = board[j][x];
                if (val != 0) {
                    if (!queue.isEmpty()) {
                        Integer peek = queue.peek();
                        if (peek != val) {
                            queue.add(val);
                        } else {
                            cnt+=2;
                            queue.pop();
                        }
                    } else {
                        queue.add(val);
                    }
                    board[j][x] = 0;
                    break;
                }
            }

        }
        return cnt;
    }
}
