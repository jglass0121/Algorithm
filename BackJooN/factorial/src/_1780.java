import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _1780 {
    static int[] count = new int[3]; // -1, 0, 1의 개수를 저장하는 배열

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[][] paper = new int[N][N];

        // 종이 입력 받기
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                paper[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        // 종이를 나누고 세는 함수 호출
        divideAndCount(paper, N, 0, 0);

        // 결과 출력
        for (int i = 0; i < 3; i++) {
            System.out.println(count[i]);
        }
    }

    static void divideAndCount(int[][] paper, int size, int x, int y) {
        if (check(paper, size, x, y)) {
            count[paper[x][y] + 1]++;
            return;
        }

        int newSize = size / 3;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                divideAndCount(paper, newSize, x + newSize * i, y + newSize * j);
            }
        }
    }

    static boolean check(int[][] paper, int size, int x, int y) {
        int value = paper[x][y]; //첫번째 수
        for (int i = x; i < x + size; i++) {
            for (int j = y; j < y + size; j++) {
                if (paper[i][j] != value) {
                    return false;
                }
            }
        }
        return true;
    }
}
