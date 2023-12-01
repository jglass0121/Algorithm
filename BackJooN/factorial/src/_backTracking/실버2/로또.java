package _backTracking.실버2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 로또 {
    static int[] lotto;
    static int[] result;
    static boolean[] visited;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int k = Integer.parseInt(st.nextToken());

            if (k == 0) {
                break;
            }

            lotto = new int[k];
            result = new int[6];
            visited = new boolean[k];

            for (int i = 0; i < k; i++) {
                lotto[i] = Integer.parseInt(st.nextToken());
            }

            combination(0, 0);

            sb.append("\n");
        }

        System.out.println(sb.toString());
    }

    static void combination(int depth, int start) {
        if (depth == 6) {
            for (int i = 0; i < 6; i++) {
                sb.append(result[i]).append(" ");
            }
            sb.append("\n");
            return;
        }
        //start : 중복 조합  방지 - 현재 선택한 숫자의 인덱스보다 큰 범위에서만 숫자 선택 가능
        for (int i = start; i < lotto.length; i++) {
            if (!visited[i]) {
                System.out.println("i = " + i);
                System.out.println("depth = " + depth);
                System.out.println("-----------------");
                visited[i] = true;
                result[depth] = lotto[i];
                combination(depth + 1, i + 1);
                visited[i] = false;
            }
        }
    }
}
