package _5장;

import java.util.*;

public class _하노이의_탑 {

    public static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) {
        int[][] solution = solution(2);

        String s = Arrays.deepToString(solution);
        System.out.println("s = " + s);
    }

    static ArrayList<int[]> seq;
    private static int[][] solution(int n) {
        seq = new ArrayList<>();
        Hanoi(n, 1, 2, 3);

        int[][] answer = new int[seq.size()][2];
        for (int i = 0; i < seq.size(); i++) {
            int[] cmd = seq.get(i);
            answer[i][0] = cmd[0];
            answer[i][1] = cmd[1];
        }
        return answer;
    }


    public static void Hanoi(int N, int start, int mid, int to) {
        int[] move = {start, to};
        System.out.println("Arrays.toString(move) = " + Arrays.toString(move));
        // 이동할 원반의 수가 1개라면?
        if (N == 1) {
            seq.add(move);
            System.out.println("Arrays.toString(move) = " + Arrays.toString(move));
            return;
        }

        // A -> C로 옮긴다고 가정할 떄,
        // STEP 1 : N-1개를 A에서 B로 이동 (= start 지점의 N-1개의 원판을 mid 지점으로 옮긴다.)
        Hanoi(N - 1, start, to, mid);

        // STEP 2 : 1개를 A에서 C로 이동 (= start 지점의 N번째 원판을 to지점으로 옮긴다.)
        seq.add(move);
        System.out.println("Arrays.toString(move) = " + Arrays.toString(move));

        // STEP 3 : N-1개를 B에서 C로 이동 (= mid 지점의 N-1개의 원판을 to 지점으로 옮긴다.)
        Hanoi(N - 1, mid, start, to);

    }
}

