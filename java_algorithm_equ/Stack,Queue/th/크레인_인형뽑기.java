package th;

import java.util.Scanner;
import java.util.Stack;

public class 크레인_인형뽑기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[][] arr = new int[num][num];
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int m = sc.nextInt();
        int[] moves = new int[m];
        for (int i = 0; i < m; i++) {
            moves[i] = sc.nextInt();
        }
        System.out.println(solution(arr, moves));

    }

    private static int solution(int[][] board, int[] moves) {
        Stack<Integer> stack = new Stack<>();
        int answer = 0;
        for (int pos : moves) {
            for (int i = 0; i < board.length; i++) {
                if (board[i][pos - 1] != 0) {
                    int tmp = board[i][pos - 1];
                    board[i][pos - 1] = 0; // 0 으로 초기화
                    if (!stack.isEmpty() && tmp == stack.peek()) { // 빈 값이 아니거나 해당 과 일치하는 경우
                        answer += 2;
                        stack.pop();
                    } else {
                        stack.add(tmp);
                    }
                    break;
                }
            }
        }
        return answer;
    }
}
