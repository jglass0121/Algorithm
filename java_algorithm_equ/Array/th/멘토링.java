package th;

import java.util.*;

public class 멘토링 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[][] tests = new int[M][N];

        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                tests[i][j] = sc.nextInt();
            }
        }

        int answer = 0;

        for (int a = 1; a <= N; a++) {         // 멘토
            for (int b = 1; b <= N; b++) {     // 멘티
                if (a == b) continue;

                boolean valid = true;

                for (int t = 0; t < M; t++) {  // 각 테스트마다 비교
                    int rankA = 0, rankB = 0;
                    for (int r = 0; r < N; r++) {
                        if (tests[t][r] == a) rankA = r;
                        if (tests[t][r] == b) rankB = r;
                    }
                    if (rankA > rankB) {
                        valid = false;
                        break;
                    }
                }

                if (valid) answer++;
            }
        }

        System.out.println(answer);
    }
}
