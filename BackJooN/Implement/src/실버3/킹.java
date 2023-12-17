package 실버3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 킹 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());  // 체스판 크기
        int kx = st.nextToken().charAt(0) - 'A';  // 킹의 열 위치 (A부터 H까지의 숫자로 변환)
        int ky = Integer.parseInt(st.nextToken()) - 1;  // 킹의 행 위치 (1부터 8까지의 숫자로 변환)
        int sx = st.nextToken().charAt(0) - 'A';  // 돌의 열 위치
        int sy = Integer.parseInt(st.nextToken()) - 1;  // 돌의 행 위치

        int[] dx = {0, 0, 1, -1, -1, -1, 1, 1, 0};  // 동서남북, 대각선 방향
        int[] dy = {1, -1, 0, 0, 1, -1, 1, -1, 0};

        String[] directions = {"R", "L", "B", "T", "RT", "LT", "RB", "LB"};

        st = new StringTokenizer(br.readLine());
        int m = Integer.parseInt(st.nextToken());  // 움직이는 횟수

        for (int i = 0; i < m; i++) {
            String move = br.readLine();

            int idx = -1; //초기화
            for (int j = 0; j < directions.length; j++) {
                if (directions[j].equals(move)) {
                    idx = j;
                    break;
                }
            }

            int nx = kx + dx[idx];
            int ny = ky + dy[idx];

            // 킹이 체스판을 벗어나지 않고 돌과 겹치지 않는 경우에만 이동
            if (nx >= 0 && nx < n && ny >= 0 && ny < n && !(nx == sx && ny == sy)) {
                kx = nx; //업데이트
                ky = ny;

                // 돌도 이동
                if (kx == sx && ky == sy) {
                    int nsx = sx + dx[idx];
                    int nsy = sy + dy[idx];

                    // 돌이 체스판을 벗어나지 않는 경우에만 이동
                    if (nsx >= 0 && nsx < n && nsy >= 0 && nsy < n) {
                        sx = nsx;
                        sy = nsy;
                    }
                }
            }
        }

        // 결과 출력
        System.out.println((char) ('A' + kx) + "" + (ky + 1));
        System.out.println((char) ('A' + sx) + "" + (sy + 1));

        br.close();
    }
}
