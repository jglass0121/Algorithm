package 실버3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 숫자정사각형 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[][] square = new int[N][M];

        // 입력 받기
        for (int i = 0; i < N; i++) {
            String line = br.readLine();
            for (int j = 0; j < M; j++) {
                square[i][j] = line.charAt(j) - '0';
            }
        }

        int answer = 1; // 정답은 최소 1

        // 정사각형의 한 변의 길이를 1부터 증가시키면서 확인
        for (int size = 1; size < Math.min(N, M); size++) {
            for (int i = 0; i < N - size; i++) {
                for (int j = 0; j < M - size; j++) {
                    // 네 꼭지점의 숫자가 모두 같다면 정사각형이다.
                    if (square[i][j] == square[i][j + size] &&
                            square[i][j] == square[i + size][j] &&
                            square[i][j] == square[i + size][j + size]) {
                        answer = Math.max(answer, (size + 1) * (size + 1));
                    }
                }
            }
        }

        System.out.println(answer);
    }
}
