import java.util.Scanner;

public class _1018 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();

        sc.nextLine();
        String[] board = new String[row];
        for (int i = 0; i < row; i++) {
            board[i] = sc.nextLine();
        }
        for (int i = 0; i < row; i++) {
            System.out.println("board[i] = " + board[i]);
        }

        //1. 체스판 자르기
        int sol = Integer.MAX_VALUE;
        for (int i = 0; i <= row-8; i++) { // 실제
            for (int j = 0; j <= col-8; j++) {
                //최소비용
                int curSol = getSolution(i, j, board);
                if (sol > curSol) {
                    sol = curSol;
                }

            }
        }
        System.out.println(sol);
        sc.close();


    }

    private static int getSolution(int startRow, int startCol, String[] board) {
        String[] orgBoard = { "WBWBWBWB", "BWBWBWBW" };
        int whiteSol = 0;
        for (int k = 0; k < 8; k++) {
            int row = startRow +k;
            for (int j = 0; j < 8; j++) {
                int col = startCol +j;
                if (board[row].charAt(col)!= orgBoard[row%2].charAt(j)) {
                    whiteSol++;
                }
            }

        }
        System.out.println("whiteSol = " + whiteSol);
        return Math.min(whiteSol, 64 - whiteSol);
    }
}
